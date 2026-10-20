package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculatorApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String date, tollAnswer, gpsAnswer, roadAnswer;
        int days, userAge;
        boolean needToll = false, needGPS = false, needRoadSideAssistance = false;
        double basicCarRental, under25SurCharge, GPSCharge, roadAssistanceCharge, tollCharge, total;
        basicCarRental = 29.99;
        under25SurCharge = basicCarRental * 0.30;
        tollCharge = 3.95;
        GPSCharge = 2.95;
        roadAssistanceCharge = 3.95;


        System.out.printf("Hi, pick a date: ");
        date = scanner.next();

        System.out.printf("For how many days: ");
        days = scanner.nextInt();

        System.out.printf("Do you want an electronic toll tag at $3.95/day (yes/no): ");
        tollAnswer = scanner.next();
        switch (tollAnswer) {
            case "yes" -> needToll = true;
            case "no" -> needToll = false;
            default -> System.out.println("Invalid answer");
        }
        if (!needToll)
            tollCharge = 0;


        System.out.printf("Do you  want a GPS at $2.95/day (yes/no): ");
        gpsAnswer = scanner.next();
        switch (gpsAnswer) {
            case "yes" -> needGPS = true;
            case "no" -> needGPS = false;
            default -> System.out.println("Invalid answer");
        }
        if (!needGPS)
            GPSCharge = 0;


        System.out.printf("Do you want roadside assistance at $3.95/day (yes/no): ");
        roadAnswer = scanner.next();
        switch (roadAnswer) {
            case "yes" -> needRoadSideAssistance = true;
            case "no" -> needRoadSideAssistance = false;
            default -> System.out.println("Invalid answer");
        }
        if (!needRoadSideAssistance)
            roadAssistanceCharge =0;


        System.out.printf("please Enter your age: ");
        userAge = scanner.nextInt();
        if (userAge >= 25)
            under25SurCharge = 0;

        total = (basicCarRental * days) + (tollCharge * days) + (GPSCharge * days) + (roadAssistanceCharge * days) + (under25SurCharge * days);

        System.out.printf("Your total is %.2f:\n" +
                "Under 25 surcharge %.2f:\n" +
                "Toll charge %.2f:\n" +
                "GPS charge %.2f\n" +
                "Roadside Assistance charge %.2f\n" +
                "for the day %s and for the period %d days\n" +
                "Thank you!",total , under25SurCharge, tollCharge, GPSCharge, roadAssistanceCharge, date, days);


    }
}
