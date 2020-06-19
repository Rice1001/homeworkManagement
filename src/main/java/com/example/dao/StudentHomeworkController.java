package com.example.dao;

import com.example.Entity.StudentHomework;
import com.example.service.StudentHomeworkService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/18 19:25
 */
@Controller
@ComponentScan("com.example.service")
@MapperScan("com.example.dao.mapper")
@RequestMapping("/submit/")
public class StudentHomeworkController {
    @Resource
    private StudentHomeworkService studentHomeworkService;

    @RequestMapping("/add")
    public String insert(@RequestParam("id") int id,
                       @RequestParam("studentId") int studentId,
                       @RequestParam("homeworkId") int homeworkId,
                       @RequestParam("homeworkContent") String homeworkContent,
                       @RequestParam("title") String title){
        if(id==0||studentId==0||homeworkId==0||null!=studentHomeworkService.findById(id)){
            return "error";
        }
        StudentHomework studentHomework = new StudentHomework();
        studentHomework.setCreateTime(new Timestamp(System.currentTimeMillis()));
        studentHomework.setId(id);
        studentHomework.setHomeworkContent(homeworkContent);
        studentHomework.setHomeworkId(homeworkId);
        studentHomework.setStudentId(studentId);
        studentHomework.setTitle(title);
        studentHomeworkService.insert(studentHomework);
        return "success";
    }

    @RequestMapping("/delete")
    public void deleteById(@RequestParam("id") int id){
        studentHomeworkService.deleteById(id);
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView("/lookStudentHomework");
        modelAndView.addObject("studentHomeworkList",studentHomeworkService.selectAll());
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/find")
    public StudentHomework findById(@RequestParam("id") int id){
        return studentHomeworkService.findById(id);
    }


    @RequestMapping("/update")
    public String update(@RequestParam("id") int id,
                       @RequestParam("studentId") int studentId,
                       @RequestParam("homeworkId") int homeworkId,
                       @RequestParam("homeworkContent") String homeworkContent,
                       @RequestParam("title") String title){
        if(id==0||studentId==0||homeworkId==0){
            return "error";
        }
        StudentHomework sh = new StudentHomework();
        sh.setCreateTime(new Timestamp(System.currentTimeMillis()));
        sh.setId(id);
        sh.setHomeworkContent(homeworkContent);
        sh.setHomeworkId(homeworkId);
        sh.setStudentId(studentId);
        sh.setTitle(title);
        studentHomeworkService.updateById(sh);
        return "success";
    }

}
