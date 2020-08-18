package com.kodilla.good.patterns.challenges.service;

import javax.xml.stream.Location;
import java.time.LocalDateTime;

public class TryBuy {

    private User user;
    private Assortment whatBuy;
    private LocalDateTime whenBuy;
    private Send whereSend;

    public TryBuy(final User user, final Assortment whatBuy, final LocalDateTime whenBuy, final Send whereSend) {
        this.user = user;
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

    public Send getWhereSend() {
        return whereSend;
    }
}
