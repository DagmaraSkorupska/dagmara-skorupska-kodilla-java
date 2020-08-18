package com.kodilla.good.patterns.challenges.service;

public class Assortment {

    private String name;
    private int price;

    public Assortment(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getNameOfAssortment() {
        return name;
    }

    public int getPriceOfAssortment() {
        return price;
    }
}
