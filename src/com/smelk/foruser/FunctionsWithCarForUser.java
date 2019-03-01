package com.smelk.foruser;

import com.smelk.car.Car;

import java.util.Scanner;

public class FunctionsWithCarForUser {

    private Scanner chooseFunc = new Scanner(System.in);

    public void functionsWithCar(Car car, ForUser foruser) {
        System.out.println("Press 1 for change current speed ");
        System.out.println("Press 2 if you want to add one passenger ");
        System.out.println("Press 3 if you want to get out one passenger ");
        System.out.println("Press 4 if you want to get out all passenger ");
        int usersChoose = chooseFunc.nextInt();
        switch (usersChoose) {
            case 1: {
                changeCurrentSpeed(car);
                break;
            }
            case 2: {
                addOnePassenger(car);
                break;
            }
            case 3: {
                getOutOnePassenger(car);
                break;
            }
            case 4: {
                getOutAllPassenger(car);
                break;
            }
        }
        System.out.println("");
        foruser.chooseFunction(car);
    }

    private void changeCurrentSpeed(Car car) {
        System.out.println("Reduce current speed for: ");
        int usersChoose = chooseFunc.nextInt();
        car.changeCurrentSpeed(usersChoose);
    }

    private void addOnePassenger(Car car) {
        if (car.getPassengerCapacityInThisMoment() < car.getPassengerCapacity()) {
            car.addOnePassenger();
        } else {
            System.out.println("Maximum passenger capacity is 5");
        }
    }

    private void getOutOnePassenger(Car car) {
        if (car.getPassengerCapacityInThisMoment() > 0) {
            car.minusOnePassenger();
        } else {
            System.out.println("It's cannot be less than 0");
        }
    }

    private void getOutAllPassenger(Car car) {
        car.getOffAllPassengers();
    }
}