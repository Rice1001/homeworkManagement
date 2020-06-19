package com.example.service;

import com.example.Entity.Homework;
import com.example.dao.mapper.HomeworkMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/18 18:47
 */
@ComponentScan("com.example.dao.mapper")
@Service("HomeworkService")
public class HomeworkService implements HomeworkServiceI {
    @Resource
    private HomeworkMapper homeworkMapper;
    @Override
    public void insert(Homework homework) {
        homeworkMapper.insert(homework);
    }

    @Override
    public void deleteById(int id) {
        homeworkMapper.deleteById(id);
    }

    @Override
    public void updateById(Homework homework) {
        homeworkMapper.updateById(homework);
    }

    @Override
    public List<Homework> selectAll() {
        return homeworkMapper.selectAll();
    }

    @Override
    public Homework findById(int id) {
        return homeworkMapper.findById(id);
    }
}
