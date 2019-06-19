package com.shineyue.cn.service.serviceImpl;

import com.shineyue.cn.mapper.TeamMapper;
import com.shineyue.cn.model.Team;
import com.shineyue.cn.model.TeamExample;
import com.shineyue.cn.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @quthor:李启云
 * @date:2019/6/19-10-03
 */
@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamMapper teamMapper;

    @Override
    public List<Team> findAll() {
        TeamExample example=new TeamExample();
         TeamExample.Criteria criteria = example.createCriteria();
         criteria.andGIdEqualTo("1");
          return teamMapper.selectByExample(example);

    }

    @Override
    public void addTeam(Team team) {

        teamMapper.insert(team);
    }

    @Override
    public void deleteTeam(String gId) {
        teamMapper.deleteByPrimaryKey(gId);
    }

    @Override
    public void updateTeam(Team team) {
        teamMapper.updateByPrimaryKey(team);
    }
}
