package com.company.models;

import com.company.enums.PoweredBy;

public class Truck extends Vehicle {
    private boolean cargoAttached;

    public Truck(PoweredBy poweredBy) {
        super(poweredBy);
    }

    @Override
    public String toString() {
        String result = super.toString() + addString();
        if (cargoAttached)
            result = result + "\n" + "\t" + "cargoAttached";
        return result;
    }

    @Override
    public int setWheels() {
        return 18;
    }

    public boolean isCargoAttached() {
        return cargoAttached;
    }

    public void setCargoAttached(boolean cargoAttached) {
        this.cargoAttached = cargoAttached;
    }
}
