package com.example.HelloWorld.CrudApis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
     String display(){
        return "HelloWorld";
    }
}
