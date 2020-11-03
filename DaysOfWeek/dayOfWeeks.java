package com.company;

import java.util.Scanner;

public class dayOfWeeks {
    public static void dayOfWeek (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = Integer.parseInt(scanner.nextLine());

        switch(dayOfWeek) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Error");
                break;
        }
    }
}
