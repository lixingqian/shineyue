package com.shineyue.demo.service.impl;

import com.shineyue.demo.mapper.TeacherMapper;
import com.shineyue.demo.pojo.Teacher;
import com.shineyue.demo.service.TeacherService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author jianghua
 * @date 2019/6/14
 */
@Service
public class TeacherServiceImpl implements TeacherService {

//    @Autowired
    @Resource

    private TeacherMapper teacherMapper;
    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    @Override
    public Teacher load(String id) {
        return teacherMapper.load(String.valueOf(id));
    }

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Teacher> selectAll() {
        return teacherMapper.selectAll();
    }

    /**
     * 增加
     * @param teacher
     */
    @Override
    public void add(Teacher teacher) {
        teacherMapper.add(teacher);
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void delete(String id) {
        teacherMapper.delete(id);
    }


    /**
     * 修改
     * @param teacher
     */
    @Override
    public void update(Teacher teacher) {
        teacherMapper.update(teacher);
    }
}
