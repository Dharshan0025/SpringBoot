package com.example.HelloWorld;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingsController {
    @GetMapping("/{name}")
    String greet(@PathVariable String name){
        return "hello "+name;
    }
    @GetMapping("/")
    String greetWithTiming(@RequestParam String name,@RequestParam String timing){
        return "Good "+timing+" hello "+name;
    }

}
