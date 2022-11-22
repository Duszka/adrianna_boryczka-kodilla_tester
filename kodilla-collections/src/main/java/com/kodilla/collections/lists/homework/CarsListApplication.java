package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Nissan;
import com.kodilla.collections.interfaces.homework.Renault;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Renault renault = new Renault(40,15,10);
        cars.add(new Mercedes(60, 40, 20));
        cars.add(renault);
        cars.add(new Nissan(53, 27, 15));

        cars.remove(2);
        cars.remove(renault);

        System.out.println(cars.size());            // [2]
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
