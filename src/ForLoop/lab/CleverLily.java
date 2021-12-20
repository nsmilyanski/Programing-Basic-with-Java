package ForLoop.lab;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashmachine = Double.parseDouble(scanner.nextLine());
        int pricetToys = Integer.parseInt(scanner.nextLine());

        double sumMoney = 0;
        double savedmoney = 0;
       double savedToys = 0;
       double brothersTakes = 0;

       for (int i =1; i<=age; i++){
            if (i % 2 == 0){
                savedmoney += 10;
                sumMoney = sumMoney + savedmoney;
                brothersTakes++;

            }else {
                savedToys++;

            }
        }
        double allsavedMoney = (savedToys * pricetToys)+(sumMoney - brothersTakes);
       double duff = priceWashmachine - allsavedMoney;
       if (allsavedMoney >= priceWashmachine){
           System.out.printf("Yes! %.2f%n", allsavedMoney - priceWashmachine);
       }else {
           System.out.printf("No! %.2f", Math.abs(duff));
       }
    }
}
