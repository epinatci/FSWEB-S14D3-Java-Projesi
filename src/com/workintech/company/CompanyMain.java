package com.workintech.company;

public class CompanyMain {
    public static void main(String[] args) {

        CarSkeleton tesla = new ElectricCar("Tesla", "Clean fuel",
                10, 100);
        CarSkeleton toyota  = new HybridCar("Toyota", "Nearly Clean",
                0.08, 100, 4);

        System.out.println(tesla.getDescription());
        System.out.println(tesla.startEngine());
        System.out.println(toyota.drive());
    }
}
