package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public interface InformationService {

    void inform(User user, Assortment whatBuy, LocalDateTime whenBuy, Send whereBuy, boolean isBought);

}
