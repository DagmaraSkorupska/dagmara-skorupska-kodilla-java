package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public class ProductService implements BuyService {
    public boolean sale(User user, Assortment whatBuy , LocalDateTime sellDate, Send whereBuy){
        System.out.println("Zamówienie produktu dla " + user.getName() + " " + user.getSurname() +
                ". Data kupna: " + sellDate.toString());
        System.out.println("Cena zakupu: " + whatBuy.getPriceOfAssortment());
        return true;
    }
}
