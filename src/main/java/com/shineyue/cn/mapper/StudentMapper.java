package com.shineyue.cn.mapper;

import com.shineyue.cn.model.Student;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(String gId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String gId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> selectAll();
}