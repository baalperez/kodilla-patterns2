package com.kodilla.patterns2.observer.homework;

import java.util.*;

public class Task implements Observable {

    private final String taskName;
    private final List<Observer> observers;

    public Task(String taskName) {
        observers = new ArrayList<>();
        this.taskName = taskName;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.addTask(this);
        }
    }

    public String getTaskName() {
        return taskName;
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
