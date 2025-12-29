package com.example.Message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final message  msg;
    public Controller(message msg) {

        this.msg = msg; // dependency injection

    }

    @GetMapping("/msg")
    public String message(){

        return msg.text();
    }
}
