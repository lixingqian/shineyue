package com.shineyue.cn.controller;

import com.shineyue.cn.model.Team;
import com.shineyue.cn.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @quthor:李启云
 * @date:2019/6/17-20-38
 */
@RestController
public class TeamController {
    @Autowired
    private TeamService teamService;
    @RequestMapping("/findAll")
    public List<Team> findAll(){

   return teamService.biglist();
    }
}
