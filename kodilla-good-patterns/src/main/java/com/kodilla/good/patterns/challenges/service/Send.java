package com.kodilla.good.patterns.challenges.service;

public class Send {

    private String street;
    private int postalCode;
    private String city;

    public Send(String street, int postalCode, String city) {
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }
}
