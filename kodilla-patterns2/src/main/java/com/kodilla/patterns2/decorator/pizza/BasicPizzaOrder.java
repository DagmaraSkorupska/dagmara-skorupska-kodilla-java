package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements Pizza {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getIngredients() {
        return "You order a basic pizza with tomato sauce and mozzarella";
    }
}
