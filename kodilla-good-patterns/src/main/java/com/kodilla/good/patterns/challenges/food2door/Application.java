package com.kodilla.good.patterns.challenges.food2door;


public class Application {
    public static void main(String[] args){

        FoodOrderRetrieve foodOrderRetrieve = new FoodOrderRetrieve();
        FoodOrder foodOrder = foodOrderRetrieve.retrieve();
        FoodOrder foodOrder1 = foodOrderRetrieve.retrieve1();
        FoodOrder foodOrder2 = foodOrderRetrieve.retrieve2();

        OrderProcessor orderProcessor = new OrderProcessor(new MailInformation(), new ProviderOrderService());
        orderProcessor.saleDTo(foodOrder);

        System.out.println("");
        orderProcessor.saleDTo(foodOrder1);

        System.out.println("");
        orderProcessor.saleDTo(foodOrder2);

    }
}
