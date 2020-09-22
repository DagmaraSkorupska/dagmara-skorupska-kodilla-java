package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Bułka z sezamem")
                .burgers(3)
                .ingredient("sałata")
                .sauce("barbecue")
                .ingredient("bekon")
                .ingredient("ser")
                .ingredient("chilli")
                .build();

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(4, howManyIngredients);

    }
}
