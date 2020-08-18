package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public class ProductRespository implements BuyRespository {
    public void createSaleProduct(User user, Assortment whatBuy , LocalDateTime whenBuy, Send whereBuy){
        System.out.println(" Zakup zapisany w bazie ");

    }
}
