package com.workintech.company;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine(){
        System.out.println("Class Name: " + getClass().getSimpleName());
        return getName() + "startig engine";
    }

    public String drive(){
        runEngine(this);
        return getName() + "is driving...";
    }

    protected void runEngine(CarSkeleton carSkeleton){
        if(carSkeleton instanceof GasPoweredCar){
            double avgKmPerLitre = ((GasPoweredCar) carSkeleton).getAvgKmPerLitre();
            System.out.println("The car engine is starting with gas" + avgKmPerLitre);
        } else if (carSkeleton instanceof HybridCar) {
            int batterySize = ((HybridCar) carSkeleton).getBatterySize();
            double avgKmPerLitre = ((HybridCar) carSkeleton).getAvgKmPerLitre();
            System.out.println("The car engine is starting with both gas and electric." + " Battery: "
                    + batterySize + " AvgKmPerLitre: " + avgKmPerLitre);
        } else if (carSkeleton instanceof  ElectricCar) {
            int batterySize = ((ElectricCar) carSkeleton).getBatterySize();
            double avgKmPerCharge = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
            System.out.println("The car engine is starting with electric." + " Battery: "
                    + batterySize + " AvgKmPerCharge: " + avgKmPerCharge);
        } else {
            System.out.println("Car type is not valid");
        }
    }
}
