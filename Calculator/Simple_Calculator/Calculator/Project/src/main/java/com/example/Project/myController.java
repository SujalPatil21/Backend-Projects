package com.example.Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {


    @GetMapping("/calc/add")
    public String add( @RequestParam int a , @RequestParam int b ){

        return "Addition : " + (a+b);
    }

    @GetMapping("/calc/sub")

    public String sub( @RequestParam int a , @RequestParam int b ){

        return "Subtraction : " +(a-b);
    }

    @GetMapping("/calc/Mul")

    public String mul(@RequestParam int a , @RequestParam int b ){

        return "Multiplication : " + (a*b);
    }

    @GetMapping("calc/Div")

        public String div(@RequestParam int a , @RequestParam int b){


            return "Division : " + (a/b);
        }

    }

