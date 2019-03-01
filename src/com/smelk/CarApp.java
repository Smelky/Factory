package com.smelk;

import com.smelk.car.Car;
import com.smelk.foruser.ForUser;

import java.time.LocalDate;

public class CarApp {

    public static void main(String[] args) {
        Car car = new Car(LocalDate.of(2012, 10, 12), "GoodEngine", 300, 10, 5, 3, 100);
        ForUser forUser = new ForUser();
        forUser.chooseFunction(car);
    }
}