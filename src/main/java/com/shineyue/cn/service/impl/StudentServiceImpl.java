package com.shineyue.cn.service.impl;

import com.shineyue.cn.mapper.StudentMapper;
import com.shineyue.cn.mapper.TeamMapper;
import com.shineyue.cn.model.Student;
import com.shineyue.cn.model.Team;
import com.shineyue.cn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

/**
 * @author YanJI
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private  StudentMapper studentMapper;

    @Autowired
    private  TeamMapper teamMapper;



    /**
     * 查询信息
     * @return
     */
    @Override
    public List<Team> listAll() {

        List<Team> team=teamMapper.listAll();
        return team;
    }

    @Override
    public String addStudent(Student student) {
        Integer index=studentMapper.addStudent(student);
        if(index >0){
            return "增加成功";
        }
        return "增加失败";
    }

    @Override
    public String updateStudent(Student student) {
        Integer i=studentMapper.updateStudent(student);
        if(i>0){
            return "修改成功";
        }
        return "修改失败";
    }

    @Override
    public String delStudent(String id) {
        Integer i=studentMapper.delStudent(id,1);
        if(i>0){
            return "删除成功";
        }
        return "删除失败";
    }

    @Override
    public Student findById(String id){
        return studentMapper.findById(id);
    }




}
