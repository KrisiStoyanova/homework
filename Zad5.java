package Homework2;

public class Zad5 {

    //Copying an Array

    public static void main(String[] args) {
        int[] originalArray = {10, 12, 1, 8, 4};
        int[] copiedArray = new int[originalArray.length];

        for (int element = 0; element < originalArray.length; element++) {
            copiedArray[element] = originalArray[element];
        }

            System.out.println("Contents of the original array:");
            for (int element = 0; element < originalArray.length; element++) {
                System.out.print(originalArray[element] + " ");
            }

            System.out.println("\n\nContents of copied array:");
            for (int element = 0; element < copiedArray.length; element++) {
                System.out.print(copiedArray[element] + " ");
            }
        }
    }


