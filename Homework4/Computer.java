package Homework4;

public class Computer {
    int year;
    double price;
    String operationSystem;

    public Computer() {

    }

    void getValues(int computer2Year, double computer2Price, String computer2OperationSystem) {
        year = computer2Year;
        price = computer2Price;
        operationSystem = computer2OperationSystem;
    }

    void printPrice() {
        System.out.println(price);
    }

    Computer(int year, double price, String operationSystem) {
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }

    public int comparePrice(Computer compare) {
        double priceComputer1 = price;
        double priceComputer2 = price;

        if ( priceComputer1 == priceComputer2) {
            return 0;
        } else if ( priceComputer1 > priceComputer2) {
            return -1;
        } else {
            return 1;
        }
    }
}
        
         
    











