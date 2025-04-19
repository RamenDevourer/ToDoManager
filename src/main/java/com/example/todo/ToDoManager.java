package com.example.todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoManager {
    private final List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public boolean removeTask(String task) {
        return tasks.remove(task);
    }

    public int getTaskCount() {
        return tasks.size();
    }
}
