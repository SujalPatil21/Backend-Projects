package com.example.Student_Task_Manager.controller;

import com.example.Student_Task_Manager.Service.TaskService;
import com.example.Student_Task_Manager.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin("*")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public List<Task> getTasks() {
        return service.getAllTasks();
    }

    @PostMapping
    public void addTask(@RequestBody Task task) {
        service.addTask(task.getTitle());
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable int id) {
        System.out.println("DELETE called for id = " + id);
        service.deleteTask(id);
    }

    @PutMapping("/{id}")
    public void updateTask(@PathVariable int id , @RequestBody Task task){


        service.update(id,task.getTitle());
    }
}
