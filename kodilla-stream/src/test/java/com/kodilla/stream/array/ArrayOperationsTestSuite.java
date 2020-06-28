package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int [] tab = new int[10];
        for(int i=0 ; i<tab.length ; i++){
            tab[i]++;
        }
        //When
        double calculatedAverage = ArrayOperations.getAverage(tab);

        //Then
        Assert.assertEquals(4.5, calculatedAverage, 0.001);

    }
}
