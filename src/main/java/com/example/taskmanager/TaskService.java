package com.example.taskmanager;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public void addTask(Task task) {
        taskRepository.save(task);
    }

    public Task getTaskById(Integer id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Error 404: ID -> " + id + "not found"));
    }


    public void deleteTask(Integer id) {
        taskRepository.deleteById(id);
    }

    public Task updateTask(Integer id, Task taskDetails) {
        return taskRepository.findById(id).map(task -> {
            task.setId(taskDetails.getId());
            task.setTitle(taskDetails.getTitle());
            task.setDescription(taskDetails.getDescription());
            task.setIsComplete(taskDetails.getIsComplete());
            return taskRepository.save(task);
        }).orElseThrow(() -> new RuntimeException("Error 404: Task not found!"));
    }
}
