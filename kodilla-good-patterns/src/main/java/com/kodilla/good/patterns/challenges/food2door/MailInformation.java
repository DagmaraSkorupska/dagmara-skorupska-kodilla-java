package com.kodilla.good.patterns.challenges.food2door;


public class MailInformation implements InformationService {

    public void inform(Provider provider, FoodOrder foodOrder) {
        if (provider.process(foodOrder)) {
            System.out.println("Zamówienie " + foodOrder.getQuantity() + " sztuk " + foodOrder.getProduct() + " ukończyło się sukcesem");
        } else {
            System.out.println("Zamówienie " + foodOrder.getQuantity() + " sztuk " + foodOrder.getProduct() + " nie może zostać zrealizowane");
        }
    }
}

