package com.sujal.QuizApplication.service;

import com.sujal.QuizApplication.dao.QuizDao;
import com.sujal.QuizApplication.dao.questionDao;
import com.sujal.QuizApplication.model.questions;
import com.sujal.QuizApplication.model.questionsWrapper;
import com.sujal.QuizApplication.model.quiz;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class quizService {

    @Autowired
    QuizDao Qdao ;

    @Autowired
    questionDao questiondao;

    public ResponseEntity<String> createQuiz(@RequestParam String category , @RequestParam int numQ , @RequestParam String title){

        List<questions> questions = questiondao.findRandomQuestionByCategory(category,numQ);
        quiz quiz = new quiz();
        quiz.setTitle(title);
        quiz.setQuestion(questions);

        Qdao.save(quiz);

        return new ResponseEntity<>("Sucess", HttpStatus.CREATED);
    }

    @Transactional
    public ResponseEntity<List<questionsWrapper>>getQuizQuestions(Integer id) {

      Optional<quiz> quiz = Qdao.findById(id);
      List<questions> questionFromDb = quiz.get().getQuestions();
      List<questionsWrapper> questionForUser = new ArrayList<>();
      for(questions q : questionFromDb){
          questionsWrapper qw = new questionsWrapper(q.getId(),q.getQuestionTitle(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
          questionForUser.add(qw);
      }
      return new ResponseEntity<>( questionForUser , HttpStatus.OK);
    }
}
