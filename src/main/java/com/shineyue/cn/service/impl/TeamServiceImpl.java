package com.shineyue.cn.service.impl;

import com.shineyue.cn.mapper.TeamMapper;
import com.shineyue.cn.model.Team;
import com.shineyue.cn.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 贵州神玥数字科技有限公司 版权所有 © Copyright 2019<br>
 *
 * @date : Created in 2019-6-17 18:30 <br>
 * @author : lixingqian
 */
@Service
public class TeamServiceImpl implements TeamService {
    /**
     * 增加
     *
     * @param team
     * @return Integer
     */
    @Override
    public Integer add(Team team) {
        return null;
    }

    /**
     * 删除
     *
     * @param id
     * @return Integer
     */
    @Override
    public Integer delete(String id) {
        return null;
    }

    /**
     * 修改
     *
     * @param team
     * @return Integer
     */
    @Override
    public Integer update(Team team) {
        return null;
    }

    /**
     * 根据ID查询
     *
     * @param id
     * @return Integer
     */
    @Override
    public Team selectById(String id) {
        return null;
    }

    /**
     * 查询所有
     *
     * @return List
     */
    @Override
    public List<Team> selectAll() {
        return null;
    }
}
