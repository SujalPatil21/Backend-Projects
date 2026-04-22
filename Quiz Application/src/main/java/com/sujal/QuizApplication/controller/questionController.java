package com.sujal.QuizApplication.controller;

import com.sujal.QuizApplication.model.questions;
import com.sujal.QuizApplication.service.questionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class questionController {

    questionService service;

    public questionController(questionService service){

        this.service = service;
    }
    @GetMapping("/allquestion")
    public ResponseEntity<List<questions>> getAllQuestion(){

        return service.getquestions();
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<questions>>getCategory(@PathVariable String category){

        return service.getCategory(category);
    }

    @PutMapping("/addQuestion")
    public ResponseEntity<String> addQuestion(@RequestBody questions question){

       return service.addQuestion(question);
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<String> deleteQuestion(@PathVariable int id){

        return service.deleteQuestion(id);
    }
}
