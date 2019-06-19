package com.shineyue.cn.mapper;


import com.shineyue.cn.model.Team;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author YanJI
 * @date 2019年6月17日18:04:30
 */
@Mapper
public interface TeamMapper {
    /**
     * 获取所有班级以及人员
     * @return
     */
    List<Team> getAllTeamAndPerson();
}
