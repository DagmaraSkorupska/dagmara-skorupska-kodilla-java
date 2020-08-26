package com.kodilla.good.patterns.challenges.flight_plan;



public class Application {
    public static void main(String[] args){

        FlightSearch flightSearch = new FlightSearch();
        flightSearch.add(new Airport("Warszawa", "Gdańsk", "Dublin"));
        flightSearch.add(new Airport("Warszawa", "Berlin", "Dublin"));
        flightSearch.add(new Airport("Wrocław", "Gdańsk", "Warszawa"));
        flightSearch.add(new Airport("Gdańsk", "Warszawa", "Kraków"));
        flightSearch.add(new Airport("Z", "X", "B"));

        System.out.println("Flights by selected departure airport: Warszawa");
        System.out.println(flightSearch.searchForFlightsFromAGivenCity("Warszawa"));
        System.out.println("Flights by selected arrival airport: Kraków");
        System.out.println(flightSearch.searchForFlightsToAGivenCity("Kraków"));
        System.out.println("Transfer in the city: Gdańsk");
        System.out.println(flightSearch.searchForFlightsWithinAGivenCity("Gdańsk"));

    }

}
