package com.sujal.QuizApplication.controller;

import com.sujal.QuizApplication.model.questions;
import com.sujal.QuizApplication.model.questionsWrapper;
import com.sujal.QuizApplication.service.quizService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class quizController {

    quizService service;

    public quizController(quizService service){

        this.service = service;
    }
    @PostMapping("/create")
    public ResponseEntity<String> createQuiz(@RequestParam String category , @RequestParam int numQ, @RequestParam String title ){

        return service.createQuiz(category,numQ,title);
    }

    @GetMapping("{id}")
    public ResponseEntity<List<questionsWrapper>> getQuiz(@PathVariable int id){

       return  service.getQuizQuestions(id);
    }
}
