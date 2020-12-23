package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MentorTestSuite {

    @Test
    public void update() {
        //Given
        QueueOfTasks student1 = new QueueOfTasks("student1");
        QueueOfTasks student2 = new QueueOfTasks("student2");
        QueueOfTasks student3 = new QueueOfTasks("student3");

        Mentor adam = new Mentor("Adam B");
        Mentor tom = new Mentor("Tom C");

        student1.registerObserver(adam);
        student2.registerObserver(tom);
        student3.registerObserver(tom);


        //When
        student1.addTask("co tam słychać");
        student2.addTask("abc");
        student3.addTask("13");


        //Then
        assertEquals(1, adam.getUpdateCount());
        assertEquals(2,tom.getUpdateCount());

    }
}