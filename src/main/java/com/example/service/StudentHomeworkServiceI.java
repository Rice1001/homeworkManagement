package com.example.service;

import com.example.Entity.Homework;
import com.example.Entity.StudentHomework;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/18 19:21
 */
public interface StudentHomeworkServiceI {
    public void insert(StudentHomework studentHomework);
    public void deleteById(int id);
    public void updateById(StudentHomework studentHomework);
    public List<StudentHomework> selectAll();
    public StudentHomework findById(int id);
}
