package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController {
    @RequestMapping("/hello")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }
}
