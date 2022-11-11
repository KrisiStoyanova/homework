package Homework1;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weekDay = sc.nextInt();
        switch (weekDay) {
            case 1:
                System.out.println("1: Monday");
                break;
            case 2:
                System.out.println("2: Tuesday");
                break;
            case 3:
                System.out.println("3: Wednesday");
                break;
            case 4:
                System.out.println("4: Thursday");
                break;
            case 5:
                System.out.println("5: Friday");
                break;
            case 6:
                System.out.println("6: Saturday");
                break;
            case 7:
                System.out.println("7: Sunday");
                break;
            default:
                System.out.println("Invalid weekday number.");
        }
    }
}
        /*if (weekDay == 1) {
            System.out.println(weekDay + ":" + " Monday");
        } else if (weekDay == 2) {
            System.out.println(weekDay + ":" + " Tuesday");
        } else if (weekDay == 3) {
            System.out.println(weekDay + ":" + " Wednesday");
        } else if (weekDay == 4) {
            System.out.println(weekDay + ":" + " Thursday");
        } else if (weekDay == 5) {
            System.out.println(weekDay + ":" + " Friday");
        } else if (weekDay == 6) {
            System.out.println(weekDay + ":" + " Saturday");
        } else if (weekDay == 7) {
            System.out.println(weekDay + ":" + " Sunday");
        } else {
            System.out.println(weekDay + ":" + " Invalid weekday number.");
        }
    }
}*/
