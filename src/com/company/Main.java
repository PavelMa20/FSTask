package com.company;

import com.company.enums.Color;
import com.company.enums.PoweredBy;
import com.company.models.Car;
import com.company.models.Motocycle;
import com.company.models.Truck;
import com.company.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Motocycle(PoweredBy.Electricity));
        vehicles.add(new Motocycle(PoweredBy.Gasoline));
        vehicles.add(new Car(PoweredBy.Gasoline));
        vehicles.add(new Car(PoweredBy.Electricity));
        vehicles.add(new Truck(PoweredBy.Diesel));

        long start = System.currentTimeMillis();
        long end = start + 60 * 1000;

        Color[] colors = Color.values();

        while (System.currentTimeMillis() < end) {
            int random = getRandomNumber(0, 4);
            Vehicle vehicle = vehicles.get(random);
            vehicle.setColor(colors[getRandomNumber(0, colors.length - 1)]);
            if (vehicle.getClass().equals(Car.class)) {
                ((Car) vehicle).setDoors(getRandomNumber(2, 5));
            }
            vehicle.setRemainPower(getRandomNumber(0, 100));
            if (vehicle.getClass().equals(Truck.class)) {
                ((Truck) vehicle).setCargoAttached(getRandomNumber(0, 1) == 1);
            }
            System.out.println(vehicle);
            System.out.println("\n");

        }


    }

    private static int getRandomNumber(int min, int max) {
        int result = (int) ((Math.random() * (max + 1 - min)) + min);
        return result;
    }

}
