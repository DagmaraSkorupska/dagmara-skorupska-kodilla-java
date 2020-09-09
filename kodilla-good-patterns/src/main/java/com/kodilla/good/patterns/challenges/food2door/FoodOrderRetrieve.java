package com.kodilla.good.patterns.challenges.food2door;

public class FoodOrderRetrieve {

    public FoodOrder retrieve(){
        Provider glutenFreeShop = new GlutenFreeShop(8);
        return new FoodOrder(glutenFreeShop, "mleko", 2);
    }

    public FoodOrder retrieve1(){
        Provider extraFoodShop = new ExtraFoodShop(2);
        return new FoodOrder(extraFoodShop, "ryba", 30);
    }

    public FoodOrder retrieve2(){
        Provider healthyShop = new HealthyShop(30, 2);
        return new FoodOrder(healthyShop, "pad thai", 50);
    }
}
