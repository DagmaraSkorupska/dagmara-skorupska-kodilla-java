package com.kodilla.stream.world;

import java.math.BigDecimal;


public class Country {
    private final String nameCountry;
    private final BigDecimal peopleQuantity;

    public Country(String nameCountry, BigDecimal peopleQuantity) {
        this.nameCountry = nameCountry;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity(){
           return peopleQuantity;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return nameCountry.equals(country.nameCountry);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
