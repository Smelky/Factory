package com.smelk.car;

public class CarDoor {
    private Boolean isWindowOpened;
    private Boolean isDoorOpened;

    public CarDoor() {

    }

    public CarDoor(Boolean window, Boolean door) {
        this.isWindowOpened = window;
        this.isDoorOpened = door;
    }

    public Boolean getWindow() {
        return isWindowOpened;
    }

    public Boolean getDoor() {
        return isDoorOpened;
    }

    public void openDoor() {
        this.isDoorOpened = true;
    }

    public void closeDoor() {
        this.isDoorOpened = false;
    }

    public void changeDoorStatus() {
        if (this.isDoorOpened == true) {
            this.isDoorOpened = false;
        } else {
            this.isDoorOpened = true;
        }
    }

    public void openWindow() {
        this.isWindowOpened = true;
    }

    public void closeWindow() {
        this.isWindowOpened = false;
    }

    public void changeWindowStatus() {
        if (this.isWindowOpened == true) {
            this.isWindowOpened = false;
        } else {
            this.isWindowOpened = true;
        }
    }

    public void displayDoor() {
        if (this.isDoorOpened == true) {
            System.out.print("open");
        } else {
            System.out.print("closed");
        }
    }

    public void displayWindow() {
        if (this.isWindowOpened == true) {
            System.out.print("open");
        } else {
            System.out.print("closed");
        }
    }
}