package com.smelk.foruser;

import com.smelk.car.Car;

import java.util.Scanner;

public class FunctionsWithWheelsForUser {

    private Scanner chooseFunc = new Scanner(System.in);

    public void chooseFunctionForWheels(Car car, ForUser forUser) {
        System.out.println("Press 1 if you wanna change old wheel to new: ");
        System.out.println("Press 2 if you wanna wipe the wheel: ");
        System.out.println("Press 3 if you want to remove all wheels: ");
        System.out.println("Press 4 if you want to add new wheel: ");
        System.out.println("Press 5 if you wanna see wheels status: ");
        int usersChoose = chooseFunc.nextInt();
        switch (usersChoose) {
            case 1: {
                chooseNewWheel(car, forUser);
                break;
            }
            case 2: {
                wipeTheWheel(car, forUser);
                break;
            }
            case 3: {
                removeAllWheels(car);
                break;
            }
            case 4: {
                addNewWheel(car);
                break;
            }
            case 5: {
                showWheelsStatus(car);
                System.out.println("");
                chooseFunctionForWheels(car, forUser);
                break;
            }
        }
        showWheelsStatus(car);
        System.out.println("");
        forUser.chooseFunction(car);
    }

    private void chooseNewWheel(Car car, ForUser forUser) {
        System.out.println("Choose number of wheel what you wanna change to new: ");
        System.out.println("If you wanna choose another function press 911: ");
        int usersChoose = chooseFunc.nextInt();
        if (usersChoose > 0) {
            usersChoose--;
        } else {
            System.out.println("Choose the wheel from 1");
            chooseNewWheel(car, forUser);
        }
        if (usersChoose == 910) {
            chooseFunctionForWheels(car, forUser);
        }
        if (usersChoose < car.getWheels().length) {
            car.getWheelsByIndex(usersChoose).changeWheelToNew();
        } else {
            System.out.println("This car has " + car.getWheels().length + " wheels");
            chooseNewWheel(car, forUser);
        }
    }

    private void wipeTheWheel(Car car, ForUser forUser) {
        System.out.println("Choose number of wheel what you wanna wipe: ");
        System.out.println("If you wanna choose another function press 911: ");
        int usersChoose = chooseFunc.nextInt();
        if (usersChoose > 0) {
            usersChoose--;
        } else {
            System.out.println("Choose the wheel from 1");
            wipeTheWheel(car, forUser);
        }
        if (usersChoose == 910) {
            chooseFunctionForWheels(car, forUser);
        }
        if (usersChoose < car.getWheels().length) {
            System.out.println("Write percent of wipe: ");
            int usersChooseForWipe = chooseFunc.nextInt();
            car.getWheelsByIndex(usersChoose).wipeTheWheel(usersChooseForWipe);
        } else {
            System.out.println("This car has " + car.getWheels().length + " wheels");
            wipeTheWheel(car, forUser);
        }

    }

    private void removeAllWheels(Car car) {
        car.getOffAllWheels();
    }

    private void addNewWheel(Car car) {
        System.out.println("How many wheels do you want to add ? ");
        int usersChoose = chooseFunc.nextInt();
        if (usersChoose <= 0) {
            System.out.println("Choose num from 1");
            addNewWheel(car);
        } else {
            car.addNewWheels(usersChoose);
        }
    }

    private void showWheelsStatus(Car car) {
        for (int i = 0; i < car.getWheels().length; i++) {
            System.out.print("Condition of " + (i + 1) + " wheel: ");
            car.getWheels()[i].display();
        }
    }
}