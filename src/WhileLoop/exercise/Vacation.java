package WhileLoop.exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());
        int countDays = 0;
        double spendingCounter = 0;
        //boolean isFaild = false;
        while (ownedMoney < neededMoney && spendingCounter < 5) {
            String moneyMove = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            countDays++;
            if (moneyMove.equals("spend")) {
                spendingCounter++;
                ownedMoney -= money;
                if (ownedMoney < 0){
                    ownedMoney = 0;
                }
            } else if (moneyMove.equals("save")) {
                ownedMoney += money;
                spendingCounter = 0;
            }
        }
        if (spendingCounter == 5){
            System.out.println("You can't save the money.");
            System.out.println(countDays);
        }else if (ownedMoney >= neededMoney){
            System.out.printf("You saved the money for %d days.", countDays);

        }
    }


}
