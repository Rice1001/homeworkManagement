package com.example.service;

import com.example.Entity.Homework;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/18 18:46
 */
public interface HomeworkServiceI {
    public void insert(Homework homework);
    public void deleteById(int id);
    public void updateById(Homework homework);
    public List<Homework> selectAll();
    public Homework findById(int id);
}
