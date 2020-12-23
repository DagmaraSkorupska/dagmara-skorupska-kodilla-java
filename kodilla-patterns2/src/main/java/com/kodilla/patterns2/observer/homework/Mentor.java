package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(QueueOfTasks queueOfTasks) {
        System.out.println(mentorName + " you have a new task: " + queueOfTasks.getNameTask() + ", from a student named : " + queueOfTasks.getNameStudent());
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
