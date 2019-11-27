package com.summer.faststarter.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by liuke on 2019/11/27 20:40
 */

@RestController
@RequestMapping("/api/mob")
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
