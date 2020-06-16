package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> listNumbers =new OddNumbersExterminator().exterminate(emptyList);
        System.out.println("Testing " + listNumbers);
        //Then
        Assert.assertEquals(emptyList,listNumbers);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> normalList = new ArrayList<Integer>();
        ArrayList<Integer> oddList = new ArrayList<Integer>();

        //When
        ArrayList<Integer> listNumbers =new OddNumbersExterminator().exterminate(normalList);
        System.out.println("Testing " + listNumbers);
        //Then
        Assert.assertEquals(oddList, listNumbers);
    }


}
