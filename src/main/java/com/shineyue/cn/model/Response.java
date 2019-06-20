package com.shineyue.cn.model;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author jianghua
 * @date 2019/6/20
 */
@Data
@Component("response")
public class Response {

    private Integer status = 200;

    private String mesage = "success";

    private Object data;
}
