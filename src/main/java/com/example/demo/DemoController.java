package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(value="hello")
    public String hello(){
        return "hello world";
    }

    @GetMapping(value="kon")
    public String kon(){
        String aiueo = "aiueo";
        String kakikukeko = "kakikukeko";
        return "kon";
    }
}
