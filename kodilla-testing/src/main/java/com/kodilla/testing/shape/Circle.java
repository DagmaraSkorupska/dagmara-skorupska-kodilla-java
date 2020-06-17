package com.kodilla.testing.shape;

public class Circle implements Shape{

    private final String shapeName;
    private final double field;

    public Circle(double radiusLength) {
        this.shapeName = "circle";
        this.field = Math.PI * radiusLength * radiusLength;
    }

    @Override
    public String getShapeName() {

        return this.shapeName;
    }

    @Override
    public double getField() {

        return this.field;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }

}
