package com.smelk.foruser;

import com.smelk.car.Car;

import java.util.Scanner;

public class FunctionsWithDoorsForUser {

    private Scanner chooseFunc = new Scanner(System.in);

    public void chooseFunctionsWithDoors(Car car, ForUser forUser) {
        System.out.println("Press 1 if you want to open door: ");
        System.out.println("Press 2 if you want to close door: ");
        System.out.println("Press 3 if you want to open window: ");
        System.out.println("Press 4 if you want to close window: ");
        System.out.println("Press 5 if you wanna see a door and window status: ");
        int usersChoose = chooseFunc.nextInt();
        switch (usersChoose) {
            case 1: {
                functionsWithDoorsOpen(car, forUser);
                break;
            }
            case 2: {
                functionsWithDoorsClose(car, forUser);
                break;
            }
            case 3: {
                functionsWithWindowsOpen(car, forUser);
                break;
            }
            case 4: {
                functionsWithWindowsClose(car, forUser);
                break;
            }
            case 5: {
                showDoorsAndWindowStatus(car);
                System.out.println("");
                chooseFunctionsWithDoors(car, forUser);
                break;
            }
        }
        showDoorsAndWindowStatus(car);
        System.out.println("");
        forUser.chooseFunction(car);
    }

    private void functionsWithDoorsOpen(Car car, ForUser forUser) {
        System.out.println("Choose what number of door you want to open: ");
        System.out.println("If you wanna choose another function press 911: ");
        int usersChoose = chooseFunc.nextInt();
        if (usersChoose > 0) {
            usersChoose--;
        } else {
            System.out.println("Choose the wheel from 1");
            functionsWithDoorsOpen(car, forUser);
        }
        if (usersChoose == 911) {
            chooseFunctionsWithDoors(car, forUser);
        }
        if (car.getDoorByIndex(usersChoose).getDoor() == true) {
            System.out.println("This door is currently open");
            functionsWithDoorsOpen(car, forUser);
        }
        if (usersChoose < car.getDoors().length) {
            car.getDoorByIndex(usersChoose).openDoor();
        } else {
            System.out.println("This car has " + car.getDoors().length + " doors");
            functionsWithDoorsOpen(car, forUser);
        }
    }

    private void functionsWithDoorsClose(Car car, ForUser forUser) {
        System.out.println("Choose what number of door you wanna close: ");
        System.out.println("If you wanna choose another function press 911: ");
        int usersChoose = chooseFunc.nextInt();
        if (usersChoose > 0) {
            usersChoose--;
        } else {
            System.out.println("Choose the wheel from 1");
            functionsWithDoorsClose(car, forUser);
        }
        if (usersChoose == 911) {
            chooseFunctionsWithDoors(car, forUser);
        }
        if (car.getDoorByIndex(usersChoose).getDoor() == false) {
            System.out.println("This door is currently close");
            functionsWithDoorsClose(car, forUser);
        }
        if (usersChoose < car.getDoors().length) {
            car.getDoorByIndex(usersChoose).closeDoor();
        } else {
            System.out.println("This car has " + car.getDoors().length + " doors");
            functionsWithDoorsClose(car, forUser);
        }
    }

    private void functionsWithWindowsOpen(Car car, ForUser forUser) {
        System.out.println("Choose what number of window you wanna open: ");
        System.out.println("If you wanna choose another function press 911: ");
        int usersChoose = chooseFunc.nextInt();
        if (usersChoose > 0) {
            usersChoose--;
        } else {
            System.out.println("Choose the wheel from 1");
            functionsWithWindowsOpen(car, forUser);
        }
        if (usersChoose == 911) {
            chooseFunctionsWithDoors(car, forUser);
        }
        if (car.getDoorByIndex(usersChoose).getWindow() == true) {
            System.out.println("This window is currently open");
            functionsWithWindowsOpen(car, forUser);
        }
        if (usersChoose < car.getDoors().length) {
            car.getDoorByIndex(usersChoose).openWindow();
        } else {
            System.out.println("This car has " + car.getDoors().length + " windows");
            functionsWithWindowsOpen(car, forUser);
        }
    }

    private void functionsWithWindowsClose(Car car, ForUser forUser) {
        System.out.println("Choose what number of window you wanna close: ");
        System.out.println("If you wanna choose another function press 911: ");
        int usersChoose = chooseFunc.nextInt();
        if (usersChoose > 0) {
            usersChoose--;
        } else {
            System.out.println("Choose the wheel from 1");
            functionsWithWindowsClose(car, forUser);
        }
        if (usersChoose == 911) {
            chooseFunctionsWithDoors(car, forUser);
        }
        if (car.getDoorByIndex(usersChoose).getWindow() == false) {
            System.out.println("This window is currently close");
            functionsWithWindowsClose(car, forUser);
        }
        if (usersChoose < car.getDoors().length) {
            car.getDoorByIndex(usersChoose).closeWindow();
        } else {
            System.out.println("This car has " + car.getDoors().length + " windows");
            functionsWithWindowsClose(car, forUser);
        }
    }

    private void showDoorsAndWindowStatus(Car car) {
        for (int i = 0; i < car.getDoors().length; i++) {
            System.out.print("The door number " + (i + 1) + " is ");
            car.getDoors()[i].displayDoor();
            System.out.print(", window in this door is ");
            car.getDoors()[i].displayWindow();
        }
    }
}