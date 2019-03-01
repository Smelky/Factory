package com.smelk.car;

public class CarDoor {
    private Boolean isWindowOpened = false;
    private Boolean isDoorOpened = false;

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
        isDoorOpened = true;
    }

    public void closeDoor() {
        isDoorOpened = false;
    }

    public void changeDoorStatus() {
        if (isDoorOpened == true) {
            isDoorOpened = false;
        } else {
            isDoorOpened = true;
        }
    }

    public void openWindow() {
        isWindowOpened = true;
    }

    public void closeWindow() {
        isWindowOpened = false;
    }

    public void changeWindowStatus() {
        if (isWindowOpened == true) {
            isWindowOpened = false;
        } else {
            isWindowOpened = true;
        }
    }

    public void displayDoor() {
        if (isDoorOpened == true) {
            System.out.print("open");
        } else {
            System.out.print("closed");
        }
    }

    public void displayWindow() {
        if (isWindowOpened == true) {
            System.out.print("open");
        } else {
            System.out.print("closed");
        }
    }
}