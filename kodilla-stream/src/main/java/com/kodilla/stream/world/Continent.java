package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Continent {

    Set<Country> countries = new HashSet<Country>();

    public void addCountry(Country country){
        countries.add(country);
    }

    public Set<Country> getCountries() {
        return countries;
    }

    public BigDecimal quantityPeopleOnContinent(){
        BigDecimal peopleOnContinent = BigDecimal.ZERO;
        for(Country country: countries){
            peopleOnContinent = peopleOnContinent.add(country.getPeopleQuantity());
        }
        return peopleOnContinent;
    }
}
