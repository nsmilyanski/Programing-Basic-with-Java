package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kindFlowers = scanner.nextLine();
        int numFlowers = Integer.parseInt(scanner.nextLine());
        int budjet = Integer.parseInt(scanner.nextLine());

        double sumFlowers = 0;

        if (kindFlowers.equals("Roses")){
            sumFlowers = numFlowers * 5.00;
            if (numFlowers > 80){
                sumFlowers = sumFlowers * 0.90;
            }

        }else if (kindFlowers.equals("Dahlias")){
            sumFlowers = numFlowers * 3.80;
            if (numFlowers > 90){
                sumFlowers = sumFlowers * 0.85;
            }

        }else if (kindFlowers.equals("Tulips")){
            sumFlowers = numFlowers *2.80;
            if (numFlowers > 80){
                sumFlowers = sumFlowers * 0.85;
            }

        }else if (kindFlowers.equals("Narcissus")){
            sumFlowers = numFlowers * 3.00;
            if (numFlowers < 120){
                sumFlowers = sumFlowers + (sumFlowers * 0.15);
            }

        }else if (kindFlowers.equals("Gladiolus")){
            sumFlowers = numFlowers * 2.50;
            if (numFlowers < 80){
                sumFlowers = sumFlowers + (sumFlowers * 0.20);
            }

        }
        if (budjet >= sumFlowers){
            double levaLeft = budjet - sumFlowers;
            System.out.printf("Hey, you have a great garden with %d %s " +
                    "and %.2f leva left.", numFlowers, kindFlowers, levaLeft);
        } else if(sumFlowers > budjet){
            double leva = sumFlowers - budjet;
            System.out.printf("Not enough money, you need %.2f leva more.",leva);
        }
    }
}
