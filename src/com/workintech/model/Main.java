package com.workintech.model;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Car Skeleton", 4);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println("*******************************");

        Car car1 = new Car( "Base car",8);
        System.out.println(car1.startEngine());
        System.out.println(car1.accelerate());
        System.out.println(car1.brake());

        System.out.println("*******************************");

        Car mitsubishi = new Mitsubishi("Outlander VRX 4WD", 6);
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        System.out.println("*******************************");

        Car ford = new Ford("Ford Falcon", 6);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        System.out.println("*******************************");

        Car holden = new Holden("Holden Commodore", 6);
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());



    }
}
