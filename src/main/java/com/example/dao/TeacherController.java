package com.example.dao;

import com.example.Entity.Teacher;
import com.example.service.TeacherService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/18 17:02
 */
@Controller
@ComponentScan("com.example.service")
@MapperScan("com.example.dao.mapper")
@RequestMapping("/teacher")
public class TeacherController {
    @Resource
    private TeacherService teacherService;


    /**
     *
     * 查找所有的教师
     * @return 教师的集合
     */
    @ResponseBody
    @RequestMapping("/findAll")
    public List<Teacher> findAll(){
        return teacherService.selectAll();
    }

    /**
     *
     * 查找指定教师
     * @return 指定教师
     */
    @ResponseBody
    @RequestMapping("/find")
    public String find(@RequestParam("id") int id){
        Teacher t = teacherService.findById(id);
        return t.getName()+"---"+t.getId();
    }

    /**
     *
     * 添加教师
     * @param name 教师名字
     * @param password 教师登录密码
     * @param id 教师id
     */
    @RequestMapping("/add")
    public void addTeacher(@RequestParam("name") String name,
                           @RequestParam("password") String password,
                           @RequestParam("id") int id){
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(name);
        teacher.setPassword(password);
        teacherService.insert(teacher);
    }


    /**
     *
     * 根据id值更新教师的信息
     * @param id 教师id
     * @param name 教师姓名
     * @param password 教师登录密码
     */
    @RequestMapping("/update")
    public void updateTeacher(@RequestParam("id") int id,
                              @RequestParam("name") String name,
                              @RequestParam("password") String password){
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(name);
        teacher.setPassword(password);
        teacherService.updateById(teacher);
    }


}
