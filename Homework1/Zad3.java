package Homework1;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        int savedNumber1 = number1;
        number1 = number2;
        number2 = number3;
        number3 = savedNumber1;
        int sumNumber1AndNumber2 = number1 + number2;
        int value = sumNumber1AndNumber2 - number3;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        /*System.out.println(sumNumber1AndNumber2);
        System.out.println(value);*/
    }
}
