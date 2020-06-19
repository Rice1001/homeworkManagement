package com.example.dao.mapper;

import com.example.Entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/18 13:11
 */
@Mapper
public interface StudentMapper {
    public void insert(Student student);
    public void deleteById(int id);
    public void updateById(Student student);
    public List<Student> selectAll();
    public Student findById(int id);
}
