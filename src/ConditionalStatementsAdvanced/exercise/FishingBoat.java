package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budjet = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numFishers = Integer.parseInt(scanner.nextLine());
        double rent = 0;
        if (season.equals("Spring")){
            rent = 3000;
            if (numFishers <= 6){
                rent = rent * 0.9;

            }else if (numFishers <= 11){
                rent = rent * 0.85;

            }else {
                rent = rent * 0.75;

            }

        }else if(season.equals("Summer")){
            rent = 4200;
            if (numFishers <= 6){
                rent = rent * 0.9;

            }else if (numFishers <= 11){
                rent = rent * 0.85;

            }else {
                rent = rent * 0.75;

            }

        }else if(season.equals("Autumn")){
            rent = 4200;
            if (numFishers <= 6){
                rent = rent * 0.9;

            }else if (numFishers <= 11){
                rent = rent * 0.85;

            }else {
                rent = rent * 0.75;

            }

        }else if (season.equals("Winter")){
            rent = 2600;
            if (numFishers <= 6){
                rent = rent * 0.9;

            }else if (numFishers <= 11){
                rent = rent * 0.85;

            }else {
                rent = rent * 0.75;

            }

        } if (numFishers % 2 == 0 && !season.equals("Autumn")){
            rent = rent * 0.95;
        }if (budjet >= rent){
            double rest = budjet - rent;
            System.out.printf("Yes! You have %.2f leva left.", rest);
        }else {
            double notrest = rent - budjet;
            System.out.printf("Not enough money! You need %.2f leva.", notrest);
        }
    }
}
