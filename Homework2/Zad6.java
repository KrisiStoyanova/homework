package Homework2;

import java.util.Arrays;

public class Zad6 {

    //Checking if two arrays are equal

    public static void main(String[] args) {

        int firstArray[] = {1, 2, 3};
        int secondArray[] = {1, 2, 3};

        if (Arrays.equals(firstArray, secondArray)) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are NOT equal.");
        }
    }
}

