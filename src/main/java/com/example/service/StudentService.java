package com.example.service;

import com.example.Entity.Student;
import com.example.dao.mapper.StudentMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/18 13:35
 */
@ComponentScan({"com.example.dao.mapper"})
@Service("StudentService")
public class StudentService implements StudentServiceI{
    @Resource
    private StudentMapper studentMapper;

    @Override
    public void insert(Student student) {
        studentMapper.insert(student);
    }

    @Override
    public void deleteById(int id) {
        studentMapper.deleteById(id);
    }

    @Override
    public void updateById(Student student) {
        studentMapper.updateById(student);
    }

    @Override
    public List<Student> selectAll() {

        return studentMapper.selectAll();
    }

    @Override
    public Student findById(int id) {
        return studentMapper.findById(id);
    }

}
