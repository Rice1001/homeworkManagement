package com.example.service;

import com.example.Entity.Teacher;
import com.example.dao.mapper.TeacherMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/18 16:55
 */
@ComponentScan("com.example.dao.mapper")
@Service("TeacherService")
public class TeacherService implements TeacherServiceI{
    @Resource
    private TeacherMapper teacherMapper;

    @Override
    public void insert(Teacher teacher) {
        teacherMapper.insert(teacher);

    }

    @Override
    public void deleteById(int id) {
        teacherMapper.deleteById(id);
    }

    @Override
    public void updateById(Teacher teacher) {
        teacherMapper.updateById(teacher);
    }

    @Override
    public List<Teacher> selectAll() {
        return teacherMapper.selectAll();
    }

    @Override
    public Teacher findById(int id) {
        return teacherMapper.findById(id);
    }
}
