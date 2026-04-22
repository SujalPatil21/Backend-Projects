package com.sujal.QuizApplication.dao;

import com.sujal.QuizApplication.model.questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface questionDao extends JpaRepository<questions,Integer> {

    List<questions> findByCategory(String category);

    @Query(value = "SELECT * FROM questions WHERE category = :category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<questions> findRandomQuestionByCategory(String category, int numQ);
}

