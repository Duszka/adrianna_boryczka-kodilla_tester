package com.kodilla.collections.adv.exercises.dictionary.homework;

import com.kodilla.collections.adv.exercises.homework.Flight;
import com.kodilla.collections.adv.exercises.homework.FlightFinder;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightsFound = flightFinder.findFlightsFrom("Wrocław");
        assertEquals(2, flightsFound.size());
    }

    @Test
    public void testFindFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightsFound = flightFinder.findFlightsTo("Warszawa");
        assertEquals(2, flightsFound.size());
    }
}
