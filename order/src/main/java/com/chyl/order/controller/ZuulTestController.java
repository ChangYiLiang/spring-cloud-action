package com.chyl.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chyl
 * @create 2018-10-08 下午10:03
 */
@RestController
@RequestMapping("zuul")
public class ZuulTestController {

    @GetMapping("hello")
    public String testZuul() {
        return "hello zuul";
    }
}
