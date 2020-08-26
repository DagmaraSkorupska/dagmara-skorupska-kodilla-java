package com.kodilla.good.patterns.challenges.flight_plan;

import java.util.Objects;

public class Airport {
    private final String departureAirport;
    private final String arrivalAirport;
    private final String transferAirport;

    public Airport(final String departureAirport, final String transferAirport, final String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.transferAirport = transferAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getTransferAirport() {
        return transferAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airports = (Airport) o;

        if (!Objects.equals(departureAirport, airports.departureAirport))
            return false;
        if (!Objects.equals(arrivalAirport, airports.arrivalAirport))
            return false;
        return Objects.equals(transferAirport, airports.transferAirport);
    }

    @Override
    public int hashCode() {
        int result = departureAirport != null ? departureAirport.hashCode() : 0;
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + (transferAirport != null ? transferAirport.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "departureAirport='" + departureAirport + '\'' +
                ", transferAirport='" + transferAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                '}';
    }
}