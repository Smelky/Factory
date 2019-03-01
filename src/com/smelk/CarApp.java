package com.smelk;

import com.smelk.car.Car;
import com.smelk.foruser.ForUser;

public class CarApp {

    public static void main(String[] args) {
        Car car = new Car("10.10.09", "GoodEngine", 300, 10, 5, 3, 100);
        ForUser forUser = new ForUser();
        forUser.chooseFunction(car);
    }
}