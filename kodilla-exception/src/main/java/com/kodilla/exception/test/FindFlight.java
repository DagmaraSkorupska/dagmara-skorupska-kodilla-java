package com.kodilla.exception.test;

import java.util.HashMap;

public class FindFlight {
    public void findFlight(Flight flight) throws RouteNotFoundException{
        HashMap<String, Boolean> airport = new HashMap<>();
        airport.put("Paris", true);
        airport.put("Warsaw", true);
        airport.put("New York", true);
        airport.put("Moscow", true);
        airport.put("London", false);
        airport.put("Poznan", false);

        if(airport.get(flight.getArrivalAirport())){
            System.out.println("From this airport travel to: " + flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Arrival airport doesn't exist");
        }
    }
}
