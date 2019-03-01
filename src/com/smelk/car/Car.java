package com.smelk.car;

public class Car {
    private final String DATE_OF_CREATION;
    private String typeOfEngine;
    private double maxSpeed;
    private int accelerationTime;
    private int passengerCapacity;
    private int passengerCapacityInThisMoment;
    private int currentSpeed;
    private CarDoor[] doors = {new CarDoor(), new CarDoor(), new CarDoor(), new CarDoor()};
    private CarWheel[] wheels = {new CarWheel(1), new CarWheel(0.8), new CarWheel(0.9), new CarWheel(0.7)};

    public Car(String DATE_OF_CREATION) {
        this.DATE_OF_CREATION = DATE_OF_CREATION;
    }

    public Car(String DATE_OF_CREATION, String typeOfEngine, double maxSpeed, int accelerationTime, int passengerCapacity, int passengerCapacityInThisMoment, int currentSpeed) {
        this.DATE_OF_CREATION = DATE_OF_CREATION;
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
        lengthNewArray = this.wheels.length + addWheels;
        CarWheel[] newArray = new CarWheel[lengthNewArray];
        for (int i = 0; i < this.wheels.length; i++) {
            newArray[i] = this.wheels[i];
        }
        for (int i = this.wheels.length; i < lengthNewArray; i++) {
            newArray[i] = new CarWheel(1);
        }
        this.wheels = new CarWheel[newArray.length];
        for (int i = 0; i < newArray.length; i++) {
            this.wheels[i] = newArray[i];
        }
    }

    public double findCurrentMaxSpeed() {
        double theWorstWheel = 0;
        double currentMaxSpeed = this.maxSpeed;
        for (int i = 0; i < this.wheels.length - 1; i++) {
            if (this.wheels[i].getCondition() > this.wheels[i + 1].getCondition()) {
                theWorstWheel = this.wheels[i + 1].getCondition();
            }
        }
        if (this.passengerCapacity > 0 | this.getWheels().length > 0) {
            return currentMaxSpeed = currentMaxSpeed * theWorstWheel;
        } else {
            return currentMaxSpeed = 0;
        }
    }

    public void displayCar() {
        System.out.println("Date of creation: " + this.DATE_OF_CREATION);
        System.out.println("Type of engine: " + this.typeOfEngine);
        System.out.println("Max speed: " + this.maxSpeed);
        System.out.println("Current recommended max speed: " + this.findCurrentMaxSpeed());
        System.out.println("Current speed: " + this.currentSpeed);
        System.out.println("Acceleration time: " + this.accelerationTime);
        System.out.println("Passenger capacity: " + this.passengerCapacity);
        System.out.println("Passenger capacity in this moment: " + this.passengerCapacityInThisMoment);

        for (int i = 0; i < this.doors.length; i++) {
            System.out.print("The door number " + (i + 1) + " is ");
            this.doors[i].displayDoor();
            System.out.print(", window in this door is ");
            this.doors[i].displayWindow();
        }
        if (this.wheels.length == 0) {
            System.out.println("This car does not have wheels ");
        }
        for (int i = 0; i < this.wheels.length; i++) {
            System.out.print("Condition of " + (i + 1) + " wheel: ");
            this.wheels[i].display();
        }
    }
}