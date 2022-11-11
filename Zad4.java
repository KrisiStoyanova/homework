package Homework2;

import java.util.Scanner;

public class Zad4 {

    //FOR Loop and WHILE Loop through an Array that contains 10 elements, type int

    public static void main(String[] args) {
        int[] arrayElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int element = 0; element < arrayElements.length; element++) {
            System.out.println(arrayElements[element]);
        }
        int element = 0;
        while (element < arrayElements.length) {
            System.out.println(arrayElements[element]);
            element++;
        }
    }
}

