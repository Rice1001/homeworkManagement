package com.example.dao.mapper;

import com.example.Entity.Homework;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/18 18:45
 */
@Mapper
public interface HomeworkMapper {
    public void insert(Homework homework);
    public void deleteById(int id);
    public void updateById(Homework homework);
    public List<Homework> selectAll();
    public Homework findById(int id);
}
