package com.shineyue.cn.mapper;

import com.shineyue.cn.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author YanJI
 */
@Repository
@Mapper
public interface StudentMapper {
    /**
     * 获取所有学生信息
     * @return list
     */
    List<Student> listAll();
}
