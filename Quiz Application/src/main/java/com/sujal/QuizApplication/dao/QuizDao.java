package com.sujal.QuizApplication.dao;


import com.sujal.QuizApplication.model.quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<quiz,Integer> {
}
