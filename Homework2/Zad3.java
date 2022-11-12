package Homework2;

import java.util.Scanner;

public class Zad3 {

    //Array of 5 numbers, type double

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arrayNumbers = new double [5];
        System.out.println("Please enter 5 numbers, type double: ");
        for (int input = 0; input < arrayNumbers.length; input++) {
            arrayNumbers[input] = sc.nextDouble();
            }
        System.out.println("Array contains following numbers: ");
        for (int input = 0; input < arrayNumbers.length; input++) {
            System.out.println(arrayNumbers[input]);
            }
        }
    }






