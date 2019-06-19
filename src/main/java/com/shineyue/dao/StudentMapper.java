package com.shineyue.dao;

import com.shineyue.model.Student;

public interface StudentMapper {
    /**
     *
     * @mbg.generated 2019-06-19 21:29:55
     */
    int deleteByPrimaryKey(String t_id);

    /**
     *
     * @mbg.generated 2019-06-19 21:29:55
     */
    int insert(Student record);

    /**
     *
     * @mbg.generated 2019-06-19 21:29:55
     */
    int insertSelective(Student record);

    /**
     *
     * @mbg.generated 2019-06-19 21:29:55
     */
    Student selectByPrimaryKey(String t_id);

    /**
     *
     * @mbg.generated 2019-06-19 21:29:55
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     *
     * @mbg.generated 2019-06-19 21:29:55
     */
    int updateByPrimaryKey(Student record);
}