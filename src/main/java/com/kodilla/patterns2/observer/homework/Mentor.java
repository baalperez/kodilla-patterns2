package com.kodilla.patterns2.observer.homework;

import java.util.*;

public class Mentor implements Observer {

    private final String mentorName;
    private final List<Student> students;
    private final Queue<Task> mentorTasks;

    public Mentor(String mentorName) {
        students = new ArrayList<>();
        mentorTasks = new ArrayDeque<>();
        this.mentorName = mentorName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return mentorName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Queue<Task> getTasks() {
        return mentorTasks;
    }

    @Override
    public void addTask(Task task) {
        mentorTasks.add(task);
        System.out.println(mentorName + ": New task to review: " + task.getTaskName());
    }
}
