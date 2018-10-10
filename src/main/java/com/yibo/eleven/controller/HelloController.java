package com.yibo.eleven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/test/{name}")
    public Map<String, String> test(@PathVariable("name") String name) {
        return Map.of("hello  test", name);
    }
}