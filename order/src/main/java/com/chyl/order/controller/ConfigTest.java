package com.chyl.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chyl
 * @create 2018-10-07 下午10:13
 */
@RestController
public class ConfigTest {

    @Value("${status}")
    private boolean status;

    @GetMapping
    public String getStatus() {
        return status + "";
    }
}
