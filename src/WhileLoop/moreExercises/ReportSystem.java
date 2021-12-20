package WhileLoop.moreExercises;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int expectMoney = Integer.parseInt(scanner.nextLine());
        String pay= scanner.nextLine();
        int counter = 0;
        int cash = 0;
        int card = 0;
        double counterCash = 0;
        double counterCard = 0;
        int allTransaction = 0;
        boolean isFaild = false;

        while (!pay.equals("End")){
            int transaction = Integer.parseInt(pay);
            counter++;
            if (counter % 2 != 0){
                if (transaction > 100){
                    System.out.println("Error in transaction!");
                    pay = scanner.nextLine();
                    continue;
                }else {
                    System.out.println("Product sold!");
                }
                counterCash++;
                cash += transaction;

            }else {
                if (transaction < 10){
                    System.out.println("Error in transaction!");
                    pay = scanner.nextLine();
                    continue;
                }else {
                    System.out.println("Product sold!");
                }
                counterCard++;
                card += transaction;
            }
            allTransaction = card + cash;
            if (expectMoney < allTransaction){
                isFaild = true;
                break;
            }
            pay = scanner.nextLine();
        }

        double averageCash = cash * 1.0/counterCash;
        double averageCard = card * 1.0/counterCard;

        if (isFaild){
        System.out.printf("Average CS: %.2f\n", averageCash);
        System.out.printf("Average CC: %.2f", averageCard);
        }else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
