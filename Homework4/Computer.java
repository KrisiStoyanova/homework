package Homework4;

public class Computer {
    int year;
    double price;
    String operationSystem;

    public Computer() {
    }

    public Computer(int year, double price, String operationSystem) {
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }

    public int comparePrice(Computer compare) {

            if (this.price == compare.price){
                return 0;
            }
            else if(this.price > compare.price) {
                return -1;
            }
            else{
                return 1;
            }
    }
}

        
         
    











