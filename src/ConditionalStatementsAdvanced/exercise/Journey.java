package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budjet = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double spendMoney = 0;
        String distination = "";
        if (budjet <= 100){
            distination = "Bulgaria";
            if (season.equals("summer")){
                spendMoney = budjet * 0.30;
            }else {
                spendMoney = budjet * 0.70;
            }
        } else  if (budjet <= 1000){
            distination = "Balkans";
            if (season.equals("summer")){
                spendMoney = budjet * 0.40;
            }else {
                spendMoney = budjet * 0.80;
            }

        }else {
            distination = "Europe";
            spendMoney = budjet * 0.90;
        } if (season.equals("summer") && !distination.equals("Europe")){
            System.out.printf("Somewhere in %s", distination);
            System.out.printf("\nCamp - %.2f", spendMoney);
        }else  {
            System.out.printf("Somewhere in %s", distination);
            System.out.printf("\nHotel - %.2f", spendMoney);
        }
    }
}
