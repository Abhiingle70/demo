package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
@RestControllerAdvice
public class Test {
    @GetMapping ("/Test")
    public String getdata(){
        return "Hello world welcome to Test page";
    }
}
