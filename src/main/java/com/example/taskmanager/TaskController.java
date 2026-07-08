package com.example.taskmanager;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/tasks")
public class TaskController {


    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("{id}")
    public Task getTaskById(@PathVariable Integer id) {
        return taskService.getTaskById(id);
    }

    @PostMapping
    public void addTask(@RequestBody Task task){
        taskService.addTask(task);
    }

    @DeleteMapping("{id}")
    public void deleteTask(@PathVariable Integer id){
        taskService.deleteTask(id);
    }

    @PutMapping("{id}")
    public void updateTask(@PathVariable Integer id, @RequestBody Task task){
        taskService.updateTask(id, task);
    }


}
