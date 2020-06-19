package com.example.dao;

import com.example.Entity.Student;
import com.example.service.StudentService;
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
 * @date 2020/6/18 13:42
 */
@Controller
@ComponentScan("com.example.service")
@MapperScan("com.example.dao.mapper")
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @ResponseBody
    @RequestMapping("/find")
    public String find(@RequestParam("id") int id){
        Student s = studentService.findById(id);
        return s.getName()+"---"+s.getId();
    }

    @RequestMapping("/addStudent")
    public void addStudent(@RequestParam ("name") String name,
                           @RequestParam("password") String password,
                           @RequestParam("id") int id){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setPassword(password);
        studentService.insert(student);
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Student> findAll(){
        List<Student> list = studentService.selectAll();
        for(Student s:list){
            System.out.println(s.getName());
        }
        return list;
    }

    @RequestMapping("/update")
    public void updateStudent(@RequestParam("id") int id,
                              @RequestParam("name") String name,
                              @RequestParam("password") String password){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setPassword(password);
        studentService.updateById(student);
    }
}
