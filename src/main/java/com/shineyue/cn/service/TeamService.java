package com.shineyue.cn.service;

import com.shineyue.cn.model.Team;

import java.util.List;

/**
 * @quthor:李启云
 * @date:2019/6/19-10-00
 */
public interface TeamService {
List<Team> findAll();
void addTeam(Team team);
void deleteTeam(String gId);
void updateTeam(Team team);
}


