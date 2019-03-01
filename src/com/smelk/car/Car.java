package com.smelk.car;

public class Car {
    private final String dateOfCreation;
    private String typeOfEngine;
    private double maxSpeed;
    private int accelerationTime;
    private int passengerCapacity;
    private int passengerCapacityInThisMoment;
    private int currentSpeed;
    private CarDoor[] doors = new CarDoor[4];
    private CarWheel[] wheels = {new CarWheel(1), new CarWheel(0.8), new CarWheel(0.9), new CarWheel(0.7)};

    public Car(String DATE_OF_CREATION) {
        this.dateOfCreation = DATE_OF_CREATION;
    }

    public Car(String DATE_OF_CREATION, String typeOfEngine, double maxSpeed, int accelerationTime, int passengerCapacity, int passengerCapacityInThisMoment, int currentSpeed) {
        this.dateOfCreation = DATE_OF_CREATION;
        this.typeOfEngine = typeOfEngine;
        this.maxSpeed = maxSpeed;
        this.accelerationTime = accelerationTime;
        this.passengerCapacity = passengerCapacity;
        this.passengerCapacityInThisMoment = passengerCapacityInThisMoment;
        this.currentSpeed = currentSpeed;
    }

    public CarDoor[] getDoors() {
        return doors;
    }

    public CarWheel[] getWheels() {
        return wheels;
    }

    public int getPassengerCapacityInThisMoment() {
        return passengerCapacityInThisMoment;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void changeCurrentSpeed(int change) {
        this.currentSpeed = this.currentSpeed - change;
    }

    public void addOnePassenger() {
        this.passengerCapacityInThisMoment++;
    }

    public void minusOnePassenger() {
        this.passengerCapacityInThisMoment--;
    }

    public void getOffAllPassengers() {
        this.passengerCapacityInThisMoment = 0;
    }

    public CarDoor getDoorByIndex(int index) {
        return this.doors[index];
    }

    public CarWheel getWheelsByIndex(int index) {
        return this.wheels[index];
    }

    public void getOffAllWheels() {
        this.wheels = new CarWheel[0];
        this.currentSpeed = 0;
    }

    public void addNewWheels(int addWheels) {
        int lengthNewArray;
        lengthNewArray = wheels.length + addWheels;
        CarWheel[] newArray = new CarWheel[lengthNewArray];
        for (int i = 0; i < wheels.length; i++) {
            newArray[i] = wheels[i];
        }
        for (int i = wheels.length; i < lengthNewArray; i++) {
            newArray[i] = new CarWheel(1);
        }
        wheels = new CarWheel[newArray.length];
        for (int i = 0; i < newArray.length; i++) {
            wheels[i] = newArray[i];
        }
    }

    public double findCurrentMaxSpeed() {
        double theWorstWheel = 0;
        double currentMaxSpeed = maxSpeed;
        for (int i = 0; i < wheels.length - 1; i++) {
            if (wheels[i].getCondition() > wheels[i + 1].getCondition()) {
                theWorstWheel = wheels[i + 1].getCondition();
            }
        }
        if (passengerCapacity > 0 | getWheels().length > 0) {
            return currentMaxSpeed = currentMaxSpeed * theWorstWheel;
        } else {
            return currentMaxSpeed = 0;
        }
    }

    public void displayCar() {
        System.out.println("Date of creation: " + dateOfCreation);
        System.out.println("Type of engine: " + typeOfEngine);
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Current recommended max speed: " + findCurrentMaxSpeed());
        System.out.println("Current speed: " + currentSpeed);
        System.out.println("Acceleration time: " + accelerationTime);
        System.out.println("Passenger capacity: " + passengerCapacity);
        System.out.println("Passenger capacity in this moment: " + passengerCapacityInThisMoment);

        for (int i = 0; i < doors.length; i++) {
            System.out.print("The door number " + (i + 1) + " is ");
            doors[i].displayDoor();
            System.out.print(", window in this door is ");
            doors[i].displayWindow();
        }
        if (wheels.length == 0) {
            System.out.println("This car does not have wheels ");
        }
        for (int i = 0; i < wheels.length; i++) {
            System.out.print("Condition of " + (i + 1) + " wheel: ");
            wheels[i].display();
        }
    }
}