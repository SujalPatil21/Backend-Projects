package com.example.Student_Task_Manager.Service;

import com.example.Student_Task_Manager.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    private List<Task> tasks = new ArrayList<>();
    private int counter = 1;

    public List<Task> getAllTasks() {
        return tasks;
    }

    public void addTask(String title) {
        tasks.add(new Task(counter++, title));
    }
    public void deleteTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }

    public void update(int id ,String newTitle){

        for(Task task : tasks){
            if(task.getId() == id){

                    task.setTitle(newTitle);
            }

        }
    }
}
