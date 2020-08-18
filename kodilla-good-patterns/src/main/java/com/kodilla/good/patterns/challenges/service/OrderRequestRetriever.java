package com.kodilla.good.patterns.challenges.service;

import javax.xml.stream.Location;
import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){

        User user = new User("abc", "Adam", "Nowak");

        Assortment whatBuy = new Assortment("mapa", 25);

        LocalDateTime whenBuy = LocalDateTime.of(2020, 8, 12, 12, 25,7);

        Send whereSend = new Send("Mickiewicza", 55698, "Wrocław" );

        return new OrderRequest(user, whatBuy, whenBuy, whereSend);

    }
}
