package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void lastLog(){
        Logger.getInstance().log("tak");
    }

    @Test
    public void testGetLastLog(){
        //Given
        //When
        String log = Logger.getInstance().getLastLog();
        System.out.println("Last log: " + log);
        //Then
        Assert.assertEquals("tak", log);
    }
}
