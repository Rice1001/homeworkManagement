package com.example.dao.mapper;

import com.example.Entity.StudentHomework;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/18 19:19
 */
@Mapper
public interface StudentHomeworkMapper {
    public void insert(StudentHomework studentHomework);
    public void deleteById(int id);
    public void updateById(StudentHomework studentHomework);
    public List<StudentHomework> selectAll();
    public StudentHomework findById(int id);
}
