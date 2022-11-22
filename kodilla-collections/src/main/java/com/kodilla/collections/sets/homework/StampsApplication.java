package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Rome", 5, 4, true));
        stamps.add(new Stamp("Venice", 4, 3, false));
        stamps.add(new Stamp("Palermo", 4, 3, false));
        stamps.add(new Stamp("Florence", 5, 5, true));
        stamps.add(new Stamp("Prato", 3, 2, false));
        stamps.add(new Stamp("Venice", 4, 3, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
