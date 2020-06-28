package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.Bidi;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent europa = new Continent();
        Continent asia = new Continent();
        europa.addCountry(new Country("Poland", new BigDecimal("40000000")));
        europa.addCountry(new Country("Germany", new BigDecimal("80000000")));
        asia.addCountry(new Country("China", new BigDecimal("140000000")));
        asia.addCountry(new Country("Vietnam", new BigDecimal("93000000")));
        asia.addCountry(new Country("Korea", new BigDecimal("74000000")));
        asia.addCountry(new Country("Japan", new BigDecimal("125000000")));
        world.addContinent(europa);
        world.addContinent(asia);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();
        BigDecimal worldExpected = new BigDecimal("552000000");

        //Then
        Assert.assertEquals(worldExpected, totalPeople);
    }
}
