package com.smelk.car;

public class CarDoor {

    private Boolean window = false;
    private Boolean door = false;

    public CarDoor() {

    }

    public CarDoor(Boolean window, Boolean door) {
        this.window = window;
        this.door = door;
    }

    public Boolean getWindow() {
        return window;
    }

    public Boolean getDoor() {
        return door;
    }

    public void openDoor() {
        this.door = true;
    }

    public void closeDoor() {
        this.door = false;
    }

    public void changeDoorStatus() {
        if (this.door == true) {
            this.door = false;
        } else {
            this.door = true;
        }
    }

    public void openWindow() {
        this.window = true;
    }

    public void closeWindow() {
        this.window = false;
    }

    public void changeWindowStatus() {
        if (this.window == true) {
            this.window = false;
        } else {
            this.window = true;
        }
    }

    public void displayDoor() {
        if (this.door == true) {
            System.out.print("open");
        } else {
            System.out.print("closed");
        }
    }

    public void displayWindow() {
        if (this.window == true) {
            System.out.print("open");
        } else {
            System.out.print("closed");
        }
    }
}