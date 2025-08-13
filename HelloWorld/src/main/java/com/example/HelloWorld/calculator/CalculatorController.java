package com.example.HelloWorld.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

    private final CalculatorService service;

    CalculatorController(CalculatorService service){
        this.service=service;
    }

    @GetMapping("/add")
    int displayAdd(@RequestParam int a , @RequestParam int b){
        return service.add(a,b);
    }
    @GetMapping("/sub")
    int displaySub(@RequestParam int a , @RequestParam int b){
        return service.sub(a,b);
    }
    @GetMapping("/mul")
    int displayMul(@RequestParam int a , @RequestParam int b){
        return service.mul(a,b);
    }
    @GetMapping("/div")
    int displayDiv(@RequestParam int a , @RequestParam int b){
        return service.div(a,b);
    }
    @GetMapping("/fact")
    int displayFact(@RequestParam int a ){
        return service.factorial(a);
    }
    @GetMapping("/square")
    int displaySquare(@RequestParam int a){
        return service.square(a);
    }


}
