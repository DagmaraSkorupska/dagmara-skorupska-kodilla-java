package com.kodilla.testing.shape;

import org.junit.*;
import com.kodilla.testing.shape.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeCollectorTestSuite {

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests were finished");
    }


    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector testList = new ShapeCollector();
        Circle shape = new Circle(12);

        //When
        testList.addFigure(shape);
        Shape actualValue = testList.getFigure(0);

        //Then
        Assert.assertEquals(shape, actualValue);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector testList = new ShapeCollector();
        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(7, 8);
        testList.addFigure(circle);
        testList.addFigure(triangle);

        //When
        testList.removeFigure(circle);

        //Then
        Assert.assertEquals(triangle, testList.getFigure(0));
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector testList = new ShapeCollector();
        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(7, 8);
        testList.addFigure(circle);
        testList.addFigure(triangle);

        //When
        Shape shape = testList.getFigure(0);

        //Then
        Assert.assertEquals(circle, shape);

    }
}
