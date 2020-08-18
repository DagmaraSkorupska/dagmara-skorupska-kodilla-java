package com.kodilla.good.patterns.challenges.service;

public class BuyDTo {

    public User user;
    public boolean isBuy;

    public BuyDTo(User user, boolean isBuy) {
        this.user = user;
        this.isBuy = isBuy;
    }

    public User getUser() {
        return user;
    }

    public boolean isBuy() {
        return isBuy;
    }
}
