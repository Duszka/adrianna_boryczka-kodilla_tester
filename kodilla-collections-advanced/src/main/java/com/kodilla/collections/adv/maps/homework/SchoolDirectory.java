package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> headmaster = new HashMap<>();
        Principal michal = new Principal("Michal", "Ochmanski");
        Principal jan = new Principal ("Jan", "Ehlert");
        Principal alicja = new Principal("Alicja", "Walczuk");

        School michalSkrzaty = new School("Skrzaty", 15, 17, 19);
        School janStokrotki = new School("Stokrotki", 24, 21, 23);
        School alicjaBystrzaki = new School("Bystrzaki", 26, 29, 28);

        headmaster.put(michal, michalSkrzaty);
        headmaster.put(jan, janStokrotki);
        headmaster.put(alicja, alicjaBystrzaki);

        for (Map.Entry<Principal, School> principalEntry : headmaster.entrySet())
            System.out.println("Dyrektorem w szkole " + principalEntry.getValue().getSchoolName() + " jest " + principalEntry.getKey().getPrincipalName() + " " + principalEntry.getKey().getPrincipalSurname() +
                    " i uczęszcza tam " + principalEntry.getValue().sumOfStudents() + " uczniów.");
    }
}
