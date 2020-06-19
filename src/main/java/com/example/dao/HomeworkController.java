package com.example.dao;

import com.example.Entity.Homework;
import com.example.Entity.Student;
import com.example.service.HomeworkService;
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
 * @date 2020/6/18 18:49
 */

@Controller
@ComponentScan("com.example.service")
@MapperScan("com.example.dao.mapper")
@RequestMapping("/homework/")
public class HomeworkController {

    @Resource
    private HomeworkService homeworkService;

    @ResponseBody
    @RequestMapping("/find")
    public String find(@RequestParam("id") int id){
        Homework h = homeworkService.findById(id);
        return h.getTitle()+"---"+h.getId();
    }

    @RequestMapping("/add")
    public String addStudent(@RequestParam ("title") String title,
                           @RequestParam("content") String content,
                           @RequestParam("id") int id){
        if(id==0||null!=homeworkService.findById(id)){
            return"error";
        }
        Homework h = new Homework();
        h.setId(id);
        h.setTitle(title);
        h.setContent(content);
        System.out.println("content:"+content);
        h.setCreateTime(new Timestamp(System.currentTimeMillis()));
        homeworkService.insert(h);
        return "success";
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView("/lookHomework");
        modelAndView.addObject("homeworkList",homeworkService.selectAll());
        return modelAndView;
    }

    @RequestMapping("/update")
    public void updateHomework(@RequestParam("id") int id,
                              @RequestParam("title") String title,
                              @RequestParam("content") String content){
        Homework homework = new Homework();
        homework.setId(id);
        homework.setTitle(title);
        homework.setContent(content);
        homework.setCreateTime(new Timestamp(System.currentTimeMillis()));
        homeworkService.updateById(homework);
    }
}
