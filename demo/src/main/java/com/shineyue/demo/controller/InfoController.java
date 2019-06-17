package com.shineyue.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jianghua
 * @date 2019/6/14
 */
@RestController
public class InfoController {

    @GetMapping("info")
    public String test(){
        return "hello idea，hello idea";
    }
}
