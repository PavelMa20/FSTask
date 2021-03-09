package com.company.models;

import com.company.enums.PoweredBy;

public class Motocycle extends Vehicle {

    public Motocycle(PoweredBy poweredBy) {
        super(poweredBy);
    }

    @Override
    public String toString() {
        return super.toString()+addString();
    }

    @Override
    public int setWheels() {
        return 2;
    }


}
