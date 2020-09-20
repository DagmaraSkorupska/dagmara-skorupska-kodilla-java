package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "Shopping Time";
    public static final String PAINTING = "Painting Time";
    public static final String DRIVING = "Driving Time";

    public final Task makeTask(final String taskClass){
        switch (taskClass){
            case SHOPPING: return new ShoppingTask("Lidl", "milk", 8);
            case PAINTING: return new PaintingTask("Painting Room", "pink", "bedroom" );
            case DRIVING: return new DrivingTask("Travel to USA", "Texas", "car");
            default: return null;
        }
    }
}
