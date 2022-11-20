package Homework3;

public class CarPerson {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.year = 2021;
        car1.price = 160000;
        car1.fuelTankCapacity = 60;
        car1.freeFuel = 50.5;
        car1.engineFuelOperationSystem = "petrol";
        car1.isSportCar = true;
        car1.changeEngineFuelOperationSystem("hybrid");

        car2.year = 2005;
        car2.price = 8000;
        car2.fuelTankCapacity = 40;
        car2.freeFuel = 34.9;
        car2.engineFuelOperationSystem = "diesel";
        car2.isSportCar = false;
        car2.useFuel(35);

        System.out.println("BMW I8 has following product details:" + '\n' + "Year: " +
                car1.year + '\n' + "Price: " + car1.price + '\n' + "Fuel Tank Capacity: " +
                car1.fuelTankCapacity + '\n' + "Engine Fuel Operation System: " +
                car1.engineFuelOperationSystem + '\n' + "Sport Car: " + car1.isSportCar +
                '\n' + "Free fuel: " + car1.freeFuel);

        System.out.println('\n' + "VW Polo has following product details:" + '\n' + "Year: " +
                car2.year + '\n' + "Price: " + car2.price + '\n' + "Fuel Tank Capacity: " +
                car2.fuelTankCapacity + '\n' + "Engine Fuel Operation System: " +
                car2.engineFuelOperationSystem + '\n' + "Sport Car: " + car2.isSportCar);
        if (car2.freeFuel > 35){
            System.out.println("Free fuel: " + (car2.freeFuel - 35));
        } else {
            System.out.println("Free fuel: " + "Not enough free fuel!");
        }
    }
}








