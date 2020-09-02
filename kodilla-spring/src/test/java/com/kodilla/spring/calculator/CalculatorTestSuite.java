package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(8, 9);
        double sub = calculator.sub(8,9);
        double mul = calculator.mul(8,9);
        double div = calculator.div(8,9);
        //Then
        Assert.assertEquals( 17, add, 0 );
        Assert.assertEquals( -1, sub, 0 );
        Assert.assertEquals( 72, mul, 0);
        Assert.assertEquals(0.8, div, 0.1);
    }
}
