package com.kodilla.good.patterns.challenges.food2door;

public class SaleDTo {

    public FoodOrder foodOrder;
    public boolean isOrdered;

    public SaleDTo(FoodOrder foodOrder, boolean isOrdered) {
        this.foodOrder = foodOrder;
        this.isOrdered = isOrdered;
    }

    public FoodOrder getFoodOrder() {
        return foodOrder;
    }
}


