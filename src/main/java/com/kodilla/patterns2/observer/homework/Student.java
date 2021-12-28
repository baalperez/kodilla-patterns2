package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String studentName;
    private final List<Task> tasks;
    private final Observer observer;

    public Student(String studentName, Observer observer) {
        tasks = new ArrayList<>();
        this.studentName = studentName;
        this.observer = observer;
    }

    public void addTask(Task task) {
        tasks.add(task);
        observer.addTask(task);
    }

    public String getStudentName() {
        return studentName;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Observer getMentor() {
        return observer;
    }
}
