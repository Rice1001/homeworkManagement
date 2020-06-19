package com.example.service;

import com.example.Entity.Teacher;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/18 16:54
 */
public interface TeacherServiceI {
    public void insert(Teacher teacher);
    public void deleteById(int id);
    public void updateById(Teacher teacher);
    public List<Teacher> selectAll();
    public Teacher findById(int id);
}
