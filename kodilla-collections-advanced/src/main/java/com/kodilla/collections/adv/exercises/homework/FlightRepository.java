package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
       List<Flight> flight = new ArrayList<>();
       flight.add(new Flight(Airport.GDN, "Gdańsk", "Warszawa"));
       flight.add(new Flight(Airport.WRO, "Wrocław", "Kraków"));
       flight.add(new Flight(Airport.WAW, "Warszawa", "Katowice"));
       flight.add(new Flight(Airport.KTW, "Katowice", "Gdańsk"));
       flight.add(new Flight(Airport.KRK, "Kraków", "Wrocław"));
       flight.add(new Flight(Airport.WRO, "Wrocław", "Warszawa"));

       return flight;
    }

    public int size() {
        return getFlightsTable().size();
    }

    public static void main(String[] args) {
        System.out.println("Dostępnych jest " + getFlightsTable().size() + " lotów.");
    }
}
