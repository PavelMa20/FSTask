package com.company.models;

import com.company.enums.PoweredBy;

public class Car extends Vehicle {
    private int doors;

    public Car(PoweredBy poweredBy) {
        super(poweredBy);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\t" + doors + " doors" + "\n"
                + addString()
                ;
    }

    @Override
    public int setWheels() {
        return 4;
    }


    public void setDoors(int doors) {
        this.doors = doors;
    }
}
