package com.kodilla.patterns.factory.tasks;


import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        assertNotNull (shopping);
        Assert.assertEquals("Lidl", shopping.getTaskName());
        Assert.assertTrue(shopping.isTaskExecuted());
    }


    @Test
    public void testFactoryPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        assertNotNull (painting);
        Assert.assertEquals("Painting Room", painting.getTaskName());
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        //Then
        assertNotNull (drivingTask);
        Assert.assertEquals("Travel to USA", drivingTask.getTaskName());
        Assert.assertFalse(drivingTask.isTaskExecuted());

    }
}
