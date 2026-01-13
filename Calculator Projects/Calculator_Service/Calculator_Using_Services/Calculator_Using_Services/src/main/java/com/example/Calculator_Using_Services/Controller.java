package com.example.Calculator_Using_Services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    private final ArithmeticService service;

    public Controller(ArithmeticService service){

        this.service = service ;
    }

    @GetMapping("/calc/add")
    public String add(@RequestParam int a , @RequestParam int b){

        return "Addition : " + service.add(a,b);
    }

    @GetMapping("/calc/sub")
    public String sub(@RequestParam int a , @RequestParam int b){

        return "Subtraction : " + service.sub(a,b);
    }

    @GetMapping("/calc/mul")
    public String mul(@RequestParam int a , @RequestParam int b){

        return "Multiplication : " + service.mul(a,b);
    }

    @GetMapping("/calc/div")
    public String div(@RequestParam int a , @RequestParam int b){

        return "Division : " + service.div(a,b);
    }

}
