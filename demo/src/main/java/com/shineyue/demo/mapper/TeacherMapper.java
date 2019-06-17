package com.shineyue.demo.mapper;

import com.shineyue.demo.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author jianghua
 * @date 2019/6/14
 */
@Mapper
public interface TeacherMapper {
    /**
     * 根据id查询数据
     * @param id
     * @return Teacher
     *
     */
    Teacher load(String id);

    /**
     * 查询所有
     * @return
     */
    List<Teacher> selectAll();

    /**
     * 增加
     * @param teacher
     */
    void add(Teacher teacher);

    /**
     * 删除
     * @param id
     */
    void delete(String id);

    /**
     * 修改
     * @param teacher
     */
    void update(Teacher teacher);
}
