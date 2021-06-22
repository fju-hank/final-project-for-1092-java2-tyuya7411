package com.fju;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static void main(String[]args){
        int fee = 30;
        Map<String, Car> cars = new HashMap<>();
        Car c1 = new Car("aaa-123","06:30");
        Car c2 = new Car("bbb-246","07:05");
        cars.put(c1.id, c1);
        cars.put(c2.id, c2);
        String id = "aaa-123";
        Car car =cars.get(id);

        if(car == null){
            System.out.println("Car not found" );
        }else {
            Date now = new Date();
            long ms = now.getTime() - c1.enter.getTime();
            long mins = ms/(1000*60);
            System.out.println("mins" + mins);
            int times = (int) mins/60;
            int finalFee = fee*times;
            System.out.println("You have to pay " + finalFee);
        }


    }
}
