package com.shineyue.cn.service.impl;


import com.shineyue.cn.mapper.TeamMapper;
import com.shineyue.cn.model.Team;
import com.shineyue.cn.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @quthor:李启云
 * @date:2019/6/17-20-32
 */
@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamMapper TeamMapper;

    @Override
    public List<Team> biglist() {

        return TeamMapper.biglist();
    }
}

