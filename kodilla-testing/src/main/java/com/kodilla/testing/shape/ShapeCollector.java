package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    public ArrayList<Shape> shapeList = new ArrayList<Shape>();



    public void addFigure(Shape shape){
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape){
        shapeList.remove(shape);
    }

    public Shape getFigure(int n){
        if(n>= 0 && n< shapeList.size()){
            return shapeList.get(n);
        } else {
            return null;
        }
    }

    public void showFigures(){
        for (Shape shape : shapeList) {
            System.out.println(shape);
        }
    }
}
