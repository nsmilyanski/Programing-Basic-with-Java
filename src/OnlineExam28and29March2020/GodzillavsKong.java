package OnlineExam28and29March2020;

import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budjet = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double priceClothsfor1 = Double.parseDouble(scanner.nextLine());

        double dekor = budjet * 0.10;

        double sumClothes = statist * priceClothsfor1;
        if (statist > 150){
            sumClothes *= 0.90;
        }
        double allSum = sumClothes + dekor;
        double result = budjet - allSum;
        if (budjet < allSum){
            double result2 = Math.abs(budjet - allSum);
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", result2);
        }else {
           System.out.println("Action!");
           System.out.printf("Wingard starts filming with %.2f leva left.", result);
        }

    }
}
