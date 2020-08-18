package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private Assortment whatBuy;
    private LocalDateTime whenBuy;
    private Send whereBuy;

    public OrderRequest(User user, Assortment whatBuy, LocalDateTime whenBuy, Send whereBuy) {
        this.user = user;
        this.whatBuy = whatBuy;
        this.whenBuy = whenBuy;
        this.whereBuy = whereBuy;
    }

    public User getUser() {
        return user;
    }

    public Assortment getWhatBuy() {
        return whatBuy;
    }

    public LocalDateTime getWhenBuy() {
        return whenBuy;
    }

    public Send getWhereBuy() {
        return whereBuy;
    }
}
