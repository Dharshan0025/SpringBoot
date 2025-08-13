package com.example.HelloWorld.CrudApis;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
    @GetMapping("/square")
    int squareOf(@RequestParam int num){
        return (int)Math.pow(num,2);
    }
    @GetMapping("/add")
    int add(@RequestParam int a, @RequestParam int b){
        return a+b;
    }
    @GetMapping("/factorial")
    int factorial(@RequestParam("n") int num){
        int fact=1;
        for(int i=num;i>0;i--){
            fact*=i;
        }
        return fact;
    }
}
