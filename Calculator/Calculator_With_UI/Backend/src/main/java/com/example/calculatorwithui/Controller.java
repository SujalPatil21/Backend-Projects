package com.example.calculatorwithui;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin // allows frontend (desktop folder) to call backend
public class Controller {

    private final Arithmetic_Service service;

    public Controller(Arithmetic_Service service) {
        this.service = service;
    }

    @PostMapping("/calculate")
    public CalcResponse calculate(@RequestBody CalcRequest request) {

        int result;

        switch (request.getOperation()) {
            case "add":
                result = service.add(request.getA(), request.getB());
                break;

            case "sub":
                result = service.sub(request.getA(), request.getB());
                break;

            case "mul":
                result = service.mul(request.getA(), request.getB());
                break;

            case "div":
                result = service.div(request.getA(), request.getB());
                break;

            default:
                throw new IllegalArgumentException("Invalid operation");
        }

        return new CalcResponse(result);
    }
}