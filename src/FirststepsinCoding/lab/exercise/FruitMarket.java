package FirststepsinCoding.lab.exercise;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // 1. Цена на ягодите в лева – реално число в интервала [0.00 … 10000.00]
        double pricestrawberry = Double.parseDouble(scanner.nextLine());

       // 2. Количеството бананите в килограми – реално число в интервала [0.00 … 10000.00]
        double numBananas = Double.parseDouble(scanner.nextLine());
       // 3. Количеството портокалите в килограми – реално число в интервала [0.00 … 10000.00]
        double numoranje = Double.parseDouble(scanner.nextLine());
        //4. Количеството малините в килограми – реално число в интервала [0.00 … 10000.00]
        double numrowsberry = Double.parseDouble(scanner.nextLine());
       // 5. Количеството ягодите в килограми – реално число в интервала [0.00 … 10000.00]
        double numstrawberry = Double.parseDouble(scanner.nextLine());

         double priceRowsberry = pricestrawberry * 50/100;
         double priceOranje = priceRowsberry * 60/100;
         double priceBananas = priceRowsberry * 20/100;

         double sumRowsberry = priceRowsberry * numrowsberry;
         double sumOranje = priceOranje * numoranje;
         double sumBananas = priceBananas * numBananas;
         double sumStrawberry = pricestrawberry * numstrawberry;

         double totalSum = sumRowsberry + sumOranje + sumBananas + sumStrawberry;

         System.out.printf("%.2f", totalSum);




    }
}
