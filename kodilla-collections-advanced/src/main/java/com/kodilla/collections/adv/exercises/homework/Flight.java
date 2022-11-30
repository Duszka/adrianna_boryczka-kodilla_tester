package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {
    private String departure;
    private String arrival;
    private Airport airport;

    public Flight(Airport airport, String departure, String arrival) {
        this.airport = airport;
        this.departure = departure;
        this.arrival = arrival;
    }

    public Airport getAirport() {
        return airport;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Flight flight = (Flight) o;
        return airport == flight.airport && departure.equals(flight.departure) && arrival.equals(flight.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airport, departure, arrival);
    }
}
