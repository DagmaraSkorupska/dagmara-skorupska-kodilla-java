package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class QueueOfTasks implements Observable {
    private final String nameStudent;
    private final List<String> nameTask;
    private final List<Observer> observers;

    public QueueOfTasks(String nameStudent) {
        nameTask = new ArrayList<>();
        this.nameStudent = nameStudent;
        observers = new ArrayList<>();
    }

    public void addTask(String task){
        nameTask.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public List<String> getNameTask() {
        return nameTask;
    }
}
