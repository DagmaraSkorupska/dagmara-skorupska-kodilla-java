package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){

        //Testing Calculator class
        System.out.println("Test- pierwszy test jednostkowy");

        Calculator calculator = new Calculator();

        System.out.println("a+b= " + calculator.addAToB(5,2));
        System.out.println("a-b= " + calculator.subtractBFromA(5,2));
    }
}
