package org.example;

public class BuilderDemo {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setWheels("Sports Wheels")
                .setEngine("V8 Engine")
                .setColor("Red")
                .build();

        System.out.println(car);
    }
}