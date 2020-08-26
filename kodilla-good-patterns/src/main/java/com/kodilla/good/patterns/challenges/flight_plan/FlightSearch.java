package com.kodilla.good.patterns.challenges.flight_plan;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    private final List<Airport> airports = new ArrayList<>();


    public List<Airport> searchForFlightsFromAGivenCity(String departureAirport){
        return airports.stream()
                .filter(d -> d.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Airport> searchForFlightsToAGivenCity(String arrivalAirport){
        return airports.stream()
                .filter(a -> a.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }

    public List<Airport> searchForFlightsWithinAGivenCity(String transferAirport){
        return airports.stream()
                .filter(d -> d.getTransferAirport().equals(transferAirport))
                .collect(Collectors.toList());
    }

    public void add(Airport airport) {
        airports.add(airport);
    }
}
