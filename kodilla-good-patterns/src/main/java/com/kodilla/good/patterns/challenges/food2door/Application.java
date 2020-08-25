package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main(String[] args){

        OrderPresent orderPresent = new OrderPresent();
        Order orderInformation = orderPresent.present();
        OrderProcessor orderProcessor = new OrderProcessor( new MailInformation(), orderInformation.getProvider());
        orderProcessor.process(orderInformation);
    }
}
