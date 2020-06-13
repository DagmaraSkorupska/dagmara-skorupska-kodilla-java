package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String reslut = simpleUser.getUsername();

        if(reslut.equals("theForumUser")){
            System.out.println("test OK");
        } else{
            System.out.println("Error!");
        }
        //Testing Calculator class
        System.out.println("Test- pierwszy test jednostkowy");

        Calculator calculator = new Calculator();

        System.out.println("a+b= " + calculator.addAToB(5,2));
        System.out.println("a-b= " + calculator.subtrackBFromA(5,2));
    }
}
