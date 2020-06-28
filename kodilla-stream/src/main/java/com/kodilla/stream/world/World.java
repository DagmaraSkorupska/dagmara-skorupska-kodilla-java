package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class World {

    Set<Continent> continents = new HashSet<Continent>();
    public void addContinent (Continent continent){
            continents.add(continent);
        }


    public Set<Continent> getContinents(){
        return continents;
        }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleOfWorld = BigDecimal.ZERO;
        return peopleOfWorld = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO , (sum, current) -> sum.add(current));
    }

}
