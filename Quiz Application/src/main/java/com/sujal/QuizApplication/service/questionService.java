package com.sujal.QuizApplication.service;

import com.sujal.QuizApplication.dao.questionDao;
import com.sujal.QuizApplication.model.questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class questionService {

    @Autowired
    questionDao dao ;

    public ResponseEntity<List<questions>> getquestions() {
        try {
            return new ResponseEntity<>(dao.findAll(), HttpStatus.OK);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<questions>> getCategory(String category) {

        try {
            return new ResponseEntity<>(dao.findByCategory(category), HttpStatus.OK);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addQuestion(questions question) {
        dao.save(question);

        return new ResponseEntity<String>("sucess",HttpStatus.OK);
    }

    public ResponseEntity<String> deleteQuestion(int id) {

              dao.deleteById(id);
              return new ResponseEntity<String>("sucess",HttpStatus.OK);



    }
}
