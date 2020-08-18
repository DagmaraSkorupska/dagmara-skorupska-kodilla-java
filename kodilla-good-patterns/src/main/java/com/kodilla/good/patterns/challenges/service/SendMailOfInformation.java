package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public class SendMailOfInformation implements InformationService {

    public void inform(User user, Assortment whatBuy, LocalDateTime whenBuy, Send whereBuy, boolean isBought){
        if(isBought) {
            System.out.println("Dzień dobry, " + user.getName() + " " + user.getSurname() +
                    " właśnie dokonałeś/aś zakupu " + whatBuy.getNameOfAssortment() + " w naszym sklepie");
            System.out.println("Data zakupu: " + whenBuy.toString());
            System.out.println("Cena zakupu: " + whatBuy.getPriceOfAssortment());
            System.out.println("Wysyłka na adres: " + whereBuy.getCity() + " " + whereBuy.getPostalCode() + " " +
                    whereBuy.getStreet());

        } else {
            System.out.println("Dzień dobry, " + user.getName() + " " + user.getSurname() +
                    "niestety nie możemy zrealizować Twojego zamówienia :( ");
        }
    }
}
