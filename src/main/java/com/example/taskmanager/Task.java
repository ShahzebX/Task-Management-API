package com.example.taskmanager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

//Annotated with @Entity. Must contain fields for id (annotated with @Id and @GeneratedValue),
// title, description, and a boolean completed.
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private boolean isComplete;

    public Task(){
    }

    public Task(Integer id,
                String title,
                String description,
                boolean isComplete) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.isComplete = isComplete;
    }

    public Integer getId(){
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getIsComplete() {
        return isComplete;
    }
    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return isComplete == task.isComplete && Objects.equals(id, task.id) && Objects.equals(title, task.title) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, isComplete);
    }
}
