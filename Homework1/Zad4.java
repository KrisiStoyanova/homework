package Homework1;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int workingHours = sc.nextInt();
        float amount = sc.nextFloat();
        boolean holiday = sc.nextBoolean();
        
        if (holiday == false) {
            System.out.println("I'll work.");
        } else {
            if (amount <= 0) {
                System.out.println("I'll watch TV at home.");
            } else {
                 if (amount > 0 && amount < 10) {
                    System.out.println("I'm going for ice cream.");
                    } else {
                        System.out.println("I'm going to cinema.");
                    }
                }
                }
            }
        }


