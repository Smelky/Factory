package com.smelk.car;

public class CarWheel {

    private double condition = 1;

    public CarWheel() {

    }

    public CarWheel(double condition) {
        this.condition = condition;
    }


    public void changeWheelToNew() {
        this.condition = 1;
    }

    public void wipeTheWheel(double percent) {
        this.condition = ((this.condition * 100) - percent) / 100;
    }

    public double getCondition() {
        return this.condition;
    }

    public void display() {
        System.out.println(condition);
    }
}