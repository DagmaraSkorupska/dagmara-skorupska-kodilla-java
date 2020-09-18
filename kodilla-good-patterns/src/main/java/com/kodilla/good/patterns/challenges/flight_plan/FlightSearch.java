package com.kodilla.good.patterns.challenges.flight_plan;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    private final List<Flight> airports = new ArrayList<>();


    public List<Flight> searchForFlightsFromAGivenCity(String departureAirport){
        return airports.stream()
                .filter(d -> d.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> searchForFlightsToAGivenCity(String arrivalAirport){
        return airports.stream()
                .filter(a -> a.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }


    public List<Flight> flightToCityByCity2(String departureAirport, String transferAirport,  String arrivalAirport){


        return airports.stream()
                .filter(d -> d.getDepartureAirport().equals(departureAirport))
                .filter(a -> a.getArrivalAirport().equals(transferAirport))
                .collect(Collectors.toList());
    }


    public List<Flight> flightToCityByCity3(String departureAirport, String transferAirport,  String arrivalAirport){

        return airports.stream()
                .filter(d -> d.getDepartureAirport().equals(transferAirport))
                .filter(a -> a.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }



    public void add(Flight flight) {
        airports.add(flight);
    }
}
