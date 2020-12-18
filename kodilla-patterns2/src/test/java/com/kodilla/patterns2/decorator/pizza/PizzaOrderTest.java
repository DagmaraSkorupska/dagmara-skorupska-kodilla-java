package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTest {
    @Test
    public void testBasicPizzaWithHamGetCost(){
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new Ham(pizza);
        //When
        BigDecimal theCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(18),theCost);
    }

    @Test
    public void testBasicPizzaWithHamGetIngredients(){
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new Ham(pizza);
        //When
        String ingredients = pizza.getIngredients();
        //Then
        assertEquals("You order a basic pizza with tomato sauce and mozzarella +ham", ingredients);
    }
    @Test
    public void testBasicPizzaWithHamExtraCheeseGetCost(){
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new Ham(pizza);
        pizza = new ExtraCheese(pizza);
        pizza = new ExtraCheese(pizza);
        //When
        BigDecimal theCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(26),theCost);
    }

    @Test
    public void testBasicPizzaWithHamExtraCheeseGetIngredients(){
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new Ham(pizza);
        pizza = new ExtraCheese(pizza);
        pizza = new ExtraCheese(pizza);
        //When
        String ingredients = pizza.getIngredients();
        //Then
        assertEquals("You order a basic pizza with tomato sauce and mozzarella +ham +extra cheese +extra cheese", ingredients);
    }

    @Test
    public void testBasicPizzaWithHamExtraCheeseMushroomsGetCost(){
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new Ham(pizza);
        pizza = new ExtraCheese(pizza);
        pizza = new ExtraCheese(pizza);
        pizza = new Mushrooms(pizza);
        //When
        BigDecimal theCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(28),theCost);
    }

    @Test
    public void testBasicPizzaWithHamExtraCheeseMushroomsGetIngredients(){
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new Ham(pizza);
        pizza = new ExtraCheese(pizza);
        pizza = new ExtraCheese(pizza);
        pizza = new Mushrooms(pizza);
        //When
        String ingredients = pizza.getIngredients();
        //Then
        assertEquals("You order a basic pizza with tomato sauce and mozzarella +ham +extra cheese +extra cheese +extra mushrooms", ingredients);
    }

}