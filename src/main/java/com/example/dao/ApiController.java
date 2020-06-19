package com.example.dao;

import com.example.Entity.Student;
import com.example.Entity.Teacher;
import com.example.service.StudentService;
import com.example.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/18 23:11
 */
@Controller
public class ApiController {
    @Resource
    StudentService studentService;
    @Resource
    TeacherService teacherService;

    @RequestMapping("/")
    public String loginPage(){
        return "login";
    }

    /**
     *
     * 验证用户登录请求
     * @param user
     * @param id
     * @param password
     * @return
     */
    @RequestMapping("/login")
    public String login(@RequestParam("user") String user,
                        @RequestParam("id") int id,
                        @RequestParam("password") String password){
        String role = "student";
        String role2 = "teacher";
        System.out.println("user:"+user+"  id:"+id+"  password:"+password);
        //判断学生用户是否存在
        switch (user)
        {
            case "student":
                Student s = studentService.findById(id);
                if(s!= null && s.getPassword().equals(password)){
                    return "first";
                }else{
                    return "error";
                }
            case "teacher":
                Teacher t = teacherService.findById(id);
                if(t != null && t.getPassword().equals(password)){
                    return "teacherFirst";
                }else{
                    return "error";
                }
            default:
                return "error";
        }
    }

    /**
     *
     * 路由到注册页面
     * @return
     */
    @RequestMapping("/registerPage")
    public String registerRoute(){
        return "register";
    }

    /**
     *
     * 路由到注册界面
     * @param id
     * @param name
     * @param password
     * @param user
     * @return
     */
    @RequestMapping("/register")
    public String register(@RequestParam("id") int id,
                           @RequestParam("name") String name,
                           @RequestParam("password") String password,
                           @RequestParam("user") String user){

        System.out.println("user:"+user+"  id:"+id+"  password:"+password);

        if(id==0||name==null||password==null){
            return "error";
        }
        else if(null!=teacherService.findById(id)||null!=studentService.findById(id)){
            return "error2";
        }

        switch (user){
            case "student":
                Student s = new Student();
                s.setPassword(password);
                s.setId(id);
                s.setName(name);
                studentService.insert(s);
                return "success";
            case "teacher":
                Teacher t = new Teacher();
                t.setId(id);
                t.setName(name);
                t.setPassword(password);
                teacherService.insert(t);
                return "success";
            default:
                return "error";
        }
    }

    /**
     *
     * 路由到提交作业界面
     * @return
     */
    @RequestMapping("/submitPage")
    public String submitRoute(){
        return "submit";
    }

    /**
     *
     * 路由到更新作业界面
     * @return
     */
    @RequestMapping("/updatePage")
    public String updateRoute(){
        return "updateHomework";
    }

    /**
     *
     * 路由到学生主页
     * @return
     */
    @RequestMapping("/first")
    public String firstRoute(){
        return "first";
    }

    /**
     * 路由到添加作业界面
     *
     * @return
     */
    @RequestMapping("/addPage")
    public String addRoute(){
        return "addHomework";
    }

}
