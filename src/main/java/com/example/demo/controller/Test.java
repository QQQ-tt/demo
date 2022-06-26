package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qtx
 * @date 2022/6/26 11:29
 */
@RestController
@RequestMapping("/test")
public class Test {

    @GetMapping("/1")
    public String test() {
        return "success1asfasf111";
    }
}
