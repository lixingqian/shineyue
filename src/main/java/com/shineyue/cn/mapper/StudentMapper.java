package com.shineyue.cn.mapper;

import com.shineyue.cn.model.Student;
import org.apache.ibatis.annotations.*;

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


    /**
     * 通过注解插入
     * @param student
     * @return
     */
    @Insert( "insert  into t_student(g_id,g_name,g_age,g_sex,g_team_id)"
            +"values ("
            +"#{id}, #{name}, #{age}, #{sex} ,#{teamId})"
            )
    Integer insertByAnnotation(Student student);

    /**
     * 通过注解更新
     * @param student
     * @return
     */
    @Update("update  t_student set "
            + "g_name=#{name},  g_age=#{age} ,g_sex=#{sex},g_team_id=#{teamId},g_status=#{status}"
            + " where g_id = #{id}")
    Integer updateByAnnotation(Student student);

    /**
     * 通过注解删除
     * @param id
     * @return
     */
    @Delete("delete from t_student where g_id=#{id} and g_status=1")
    Integer delByAnnotation(String id );

    /**
     * 通过注解查询
     * @param
     * @return
     */
    @Select("select * from t_student where g_status=0")
    List<Student> findByAnnotation();

}
