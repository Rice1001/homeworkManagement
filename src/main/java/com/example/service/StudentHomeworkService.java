package com.example.service;

import com.example.Entity.Homework;
import com.example.Entity.StudentHomework;
import com.example.dao.mapper.StudentHomeworkMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/18 19:22
 */
@ComponentScan("com.example.dao.mapper")
@Service("StudentHomeworkService")
public class StudentHomeworkService implements StudentHomeworkServiceI {

    @Resource
    private StudentHomeworkMapper studentHomeworkMapper;

    @Override
    public void insert(StudentHomework homework) {
        studentHomeworkMapper.insert(homework);

    }

    @Override
    public void deleteById(int id) {
        studentHomeworkMapper.deleteById(id);
    }

    @Override
    public void updateById(StudentHomework homework) {
        studentHomeworkMapper.updateById(homework);
    }

    @Override
    public List<StudentHomework> selectAll() {
        return studentHomeworkMapper.selectAll();
    }

    @Override
    public StudentHomework findById(int id) {
        return studentHomeworkMapper.findById(id);
    }
}
