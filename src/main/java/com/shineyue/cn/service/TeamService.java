package com.shineyue.cn.service;

import com.shineyue.cn.model.Team;

import java.util.List;

/**
 * @author YanJI
 */
public interface TeamService {
    /**
     * 获取所有班级以及人员
     * @return
     */
    List<Team> getAllTeamAndPerson();
}
