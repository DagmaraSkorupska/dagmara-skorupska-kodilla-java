package com.kodilla.exception.test;

public class Main {
    public static void main(String[] args){
        Flight flight = new Flight("Paris", "test");
        FindFlight flightFinder = new FindFlight();

        try{
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Error: " + e);
        }

    }
}
