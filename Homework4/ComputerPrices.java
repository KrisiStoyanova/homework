package Homework4;

public class ComputerPrices {

    public static void main(String[] args) {
        Computer computer1 = new Computer(2021, 2599.99, "Microsoft");
        Computer computer2 = new Computer();
        computer2.getValues(2020, 3129.99, "macOS");
        computer1.printPrice();
        computer2.printPrice();
    }
}







