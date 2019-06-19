package com.shineyue.cn.mapper;

import com.shineyue.cn.model.Student;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface StudentMapper {
    /**
     * 根据id删除学生信息
     * @param gId
     * @return
     */
    int deleteByPrimaryKey(String gId);
    /**
     * 添加学生信息  不判断添加
     * @param record
     * @return
     */

    int insert(Student record);

    /**
     *添加学生信息 判断添加
     * @param record
     * @return
     */
    int insertSelective(Student record);
    /**
     * 根据id查询学生信息
     * @param gId
     * @return
     */
    Student selectByPrimaryKey(String gId);

    /**
     * 根据id修改学生信息 判断修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Student record);
    /**
     * 根据id修改学生信息 不判断修改
     * @param record
     * @return
     */

    int updateByPrimaryKey(Student record);
}