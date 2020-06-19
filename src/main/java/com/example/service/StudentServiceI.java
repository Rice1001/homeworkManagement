package com.example.service;

import com.example.Entity.Student;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/18 13:35
 */
public interface StudentServiceI {
    public void insert(Student student);
    public void deleteById(int id);
    public void updateById(Student student);
    public List<Student> selectAll();
    public Student findById(int id);
}
