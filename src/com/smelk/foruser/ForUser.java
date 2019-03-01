package com.smelk.foruser;

import com.smelk.car.Car;

import java.util.Scanner;

public class ForUser {

    private Scanner chooseFunc = new Scanner(System.in);

    public void chooseFunction(Car car) {
        System.out.println("What do you want to do ? ");
        System.out.println("Press 1 if you want to work with doors and windows: ");
        System.out.println("Press 2 if you want work with wheels: ");
        System.out.println("Press 3 if you want work with car: ");
        System.out.println("Press 4 for display all car's parameters: ");
        System.out.println("Press 0 if you want to exit from app: ");
        int usersChoose = chooseFunc.nextInt();
        switch (usersChoose) {
            case 1: {
                FunctionsWithDoorsForUser functionsWithDoorsForUser = new FunctionsWithDoorsForUser();
                functionsWithDoorsForUser.chooseFunctionsWithDoors(car, this);
                break;
            }
            case 2: {
                FunctionsWithWheelsForUser functionsWithWheelsForUser = new FunctionsWithWheelsForUser();
                functionsWithWheelsForUser.chooseFunctionForWheels(car, this);
                break;
            }
            case 3: {
                FunctionsWithCarForUser functionsWithCarForUser = new FunctionsWithCarForUser();
                functionsWithCarForUser.functionsWithCar(car, this);
                break;
            }
            case 4: {
                car.displayCar();
                System.out.println("");
                chooseFunction(car);
                break;
            }
            case 5: {
                return;
            }
        }
    }
}