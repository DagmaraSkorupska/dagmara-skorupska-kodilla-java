package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.getDoneList().addTask("done1");
        board.getDoneList().addTask("done2");
        board.getInProgressList().addTask("in progress3");
        board.getInProgressList().addTask("in progress4");
        board.getInProgressList().addTask("in progress5");
        board.getToDoList().addTask("to do 6");


        //Then
        Assert.assertEquals(1,board.getToDoList().getTasks().size());
        Assert.assertEquals(3,board.getInProgressList().getTasks().size());
        Assert.assertEquals(2,board.getDoneList().getTasks().size());
    }

}
