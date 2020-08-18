package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public interface BuyService {

    boolean sale(User user, Assortment whatBuy , LocalDateTime selleDate, Send whereBuy);
}
