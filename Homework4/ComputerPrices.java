package Homework4;

public class ComputerPrices {

    public static void main(String[] args) {

        Computer computer1 = new Computer();
        computer1.year = 2020;
        computer1.price = 2499.99;
        computer1.operationSystem = "macOS";

        Computer computer2 = new Computer(2021, 2599.99, "Microsoft");
        int result = computer1.comparePrice(computer2);
        System.out.println("result = " + result);
    }
}







