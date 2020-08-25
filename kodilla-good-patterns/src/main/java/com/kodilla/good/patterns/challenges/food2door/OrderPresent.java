package com.kodilla.good.patterns.challenges.food2door;

public class OrderPresent {
    public Order present() {
        ProviderService ekoFood = new ProviderService("Eko Food", "ul. Woronicza 13, Warszawa",  "maślanka" );
        int quantity = 2;

        return new Order(ekoFood, quantity);
    }
}
