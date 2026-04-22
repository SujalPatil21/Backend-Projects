package com.sujal.QuizApplication.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

import java.util.List;


@Entity
public class quiz {

    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Setter
    private String title;

    @ManyToMany
    private List<questions> questions;
    public void setQuestion(List<questions> questions) {
        this.questions = questions;
    }
    public List<questions> getQuestions() {
        return questions;
    }


    public String getTitle() {
        return title;
    }

    public Integer getId() {
        return id;
    }


}
