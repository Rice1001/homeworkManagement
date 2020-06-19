package com.example.dao.mapper;

import com.example.Entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/18 16:53
 */
@Mapper
public interface TeacherMapper {
    public void insert(Teacher teacher);
    public void deleteById(int id);
    public void updateById(Teacher teacher);
    public List<Teacher> selectAll();
    public Teacher findById(int id);
}
