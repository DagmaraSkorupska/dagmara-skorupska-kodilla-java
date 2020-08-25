package com.kodilla.good.patterns.challenges.food2door;

public class Order {
    private final Provider provider;
    private final int quantity;

    public Order(final Provider provider, final int quantity) {
        this.provider = provider;
        this.quantity = quantity;
    }

    public Provider getProvider() {
        return provider;
    }

    public int getQuantity() {
        return quantity;
    }

}
