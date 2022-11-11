package Homework1;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int savedNumber1 = number1;
        number1 = number2;
        number2 = savedNumber1;
        double number3 = sc.nextDouble();
        double number4 = sc.nextDouble();
        double savedNumber3 = number3;
        number3 = number4;
        number4 = savedNumber3;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        double number1Converted = number1;
        double number2Converted = number2;
        System.out.println(number1Converted + number2Converted + number3 + number4);
        int number3Converted = (int) number3;
        int number4Converted = (int) number4;
        System.out.println(number1 + number2 + number3Converted + number4Converted);
    }
}
