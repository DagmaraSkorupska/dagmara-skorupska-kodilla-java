package com.kodilla.good.patterns.challenges.food2door;

interface Provider {
    boolean process(Order orderInformation);
    String getName();
    String getAddress();
    String getProduct();
}
