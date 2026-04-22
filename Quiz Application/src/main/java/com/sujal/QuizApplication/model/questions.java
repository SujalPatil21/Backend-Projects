package com.sujal.QuizApplication.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class questions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "question_title")
    private String questionTitle;

    @Column(name = "right_answer")
    private String rightAnswer;

    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String difficultylevel;
    private String category;


}
