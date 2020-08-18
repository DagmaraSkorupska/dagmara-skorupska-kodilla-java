package com.kodilla.good.patterns.challenges.service;


import java.time.LocalDateTime;

public interface BuyRespository {

    void createSaleProduct (User user, Assortment whatBuy , LocalDateTime whenBuy, Send whereBuy);

}
