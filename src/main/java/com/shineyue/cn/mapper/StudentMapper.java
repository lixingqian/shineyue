package com.shineyue.cn.mapper;

import com.shineyue.cn.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author YanJI
 */
@Mapper
public interface StudentMapper {
    /**
     * 通过班级id查询
     * @param teamId
     * @return
     */
    List<Student> listAll(String teamId);

    /**
     * 增加学生信息
     * @param student
     * @return
     */
    Integer addStudent(Student student);

    /**
     * 修改学生信息
     * @param student
     * @return
     */
    Integer updateStudent(Student student);

    /**
     * 删除id
     * @param id
     * @param status
     * @return
     */
    Integer delStudent(String id,int status );

    /**
     * 通过id查找
     * @param id
     * @return
     */
    Student findById(String id);

}
