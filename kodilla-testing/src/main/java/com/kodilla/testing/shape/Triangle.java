package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private final String shapeName;
    private final double field;

    public Triangle(double sideLength, double height) {
        this.shapeName = "triangle";
        this.field = 0.5 * sideLength * height;
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
        return "Triangle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}
