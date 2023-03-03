package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
@RestControllerAdvice
public class Test2 {
    @GetMapping ("/Test")
    public String getdata(){
        return "Hello world welcome to Test page";
    }
}
