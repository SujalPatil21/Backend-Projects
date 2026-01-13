package com.example.Calculator_Using_Services;


import org.springframework.stereotype.Service;

@Service
public class ArithmeticService {

    public int add(int a , int b ){

        return a+b;
    }
    public int sub(int a , int b ){

        return a-b;
    }
    public int mul(int a , int b ){

        return a*b;
    }
    public int div(int a , int b ){

        return a/b;
    }

}
