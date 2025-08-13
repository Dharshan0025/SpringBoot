package com.example.HelloWorld.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {


    public int add(int a ,int b){
        return a+b;
    }

    public int sub(int a,int b){
        return a-b;
    }

    public int mul(int a,int b){
        return a*b;
    }

    public int div(int a,int b){
        if(b!=0){
            return a/b;
        }else{
            throw new ArithmeticException("Division by zero is not allowed");
        }
    }

    public int factorial(int a){
        int fact=1;
        for(int i=a;i>1;i--){
            fact*=i;
        }
        return fact;
    }

    public int square(int a){
        return a*a;
    }
}
