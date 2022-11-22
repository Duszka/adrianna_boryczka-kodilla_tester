package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Nissan;
import com.kodilla.collections.interfaces.homework.Renault;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car brand: " + getCarBrand(car));
        System.out.println("Car acceleration: " + car.getIncreaseSpeed());
    }

    private static String getCarBrand(Car car) {
        if (car instanceof Mercedes)
            return "Mercedes";
        else if (car instanceof Renault)
            return "Renault";
        else if (car instanceof Nissan)
            return "Nissan";
        else
            return "Unknown car brand";
    }
}
