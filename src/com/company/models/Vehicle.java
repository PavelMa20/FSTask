package com.company.models;

import com.company.enums.Color;
import com.company.enums.PoweredBy;

public abstract class Vehicle {

    private String name;
    private int wheels;
    private Color color;
    private int remainPower;
    private PoweredBy poweredBy;


    public Vehicle(PoweredBy poweredBy) {
        this.poweredBy = poweredBy;
        this.name = this.getClass().getSimpleName();
        if (poweredBy == PoweredBy.Electricity)
            this.name = poweredBy.toString() + " " + name;
        this.wheels = setWheels();
    }

    @Override
    public String toString() {
        return name + " :\n" +
                "\t" + wheels + " wheels\n";
    }

    protected String addString() {
        return "\t" + color + "\n" +
                "\t" + "%" + remainPower + "\n" +
                "\t" + "PoweredBy = " + poweredBy;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getRemainPower() {
        return remainPower;
    }

    public void setRemainPower(int remainPower) {
        this.remainPower = remainPower;
    }

    public abstract int setWheels();
}
