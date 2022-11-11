package Homework1;

import java.util.Scanner;

public class Zad1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the minimum amount in EUR (please do not use comma) you would like to donate:");
        double minDonationAmount = sc.nextDouble();
        System.out.println("The minimum amount you would like to donate is " + minDonationAmount + " €.");
        System.out.println("Enter the maximum amount in EUR (please do not use comma) you would like to donate:");
        double maxDonationAmount = sc.nextDouble();
        System.out.println("The maximum amount you would like to donate is " + maxDonationAmount + " €.");
        System.out.println("Enter the amount in EUR (please do not use comma) you would like to donate:");
        double estimatedDonationAmount = sc.nextDouble();
        if (estimatedDonationAmount > minDonationAmount && estimatedDonationAmount < maxDonationAmount)
            System.out.println("The estimated amount you would like to donate is " + estimatedDonationAmount + " €.");
        else
            System.out.println("The amount you would like to donate " + estimatedDonationAmount + " €" + " is outside the range you've entered.");
        }
    }

