package com.example.Student_Task_Manager.model;

public class Task {
    private Integer id;
    private String title;

    public Task() {}
    public Task(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}

