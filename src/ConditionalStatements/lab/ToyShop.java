package ConditionalStatements.lab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // 1. Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
        double priceVacation = Double.parseDouble(scanner.nextLine());
       //  2. Брой пъзели - цяло число в интервала [0… 1000]
        int numPuzzels = Integer.parseInt(scanner.nextLine());
       // 3. Брой говорещи кукли - цяло число в интервала [0 … 1000]
        int numDolls = Integer.parseInt(scanner.nextLine());
       // 4. Брой плюшени мечета - цяло число в интервала [0 … 1000]
        int numBears = Integer.parseInt(scanner.nextLine());
       // 5. Брой миньони - цяло число в интервала [0 … 1000]
        int numMinions = Integer.parseInt(scanner.nextLine());
       // 6. Брой камиончета - цяло число в интервала [0 … 1000]
        int numTrucks = Integer.parseInt(scanner.nextLine());

        double priceToys = (numPuzzels * 2.60) + (numDolls * 3) + (numBears * 4.10) + (numMinions * 8.20)
                + (numTrucks * 2) ;
        int numToys = numPuzzels+numDolls+numBears+numMinions+numTrucks;
         if (numToys >= 50){

             priceToys *= 0.75;

         }
            priceToys *= 0.9;
         if (priceToys >= priceVacation){
             System.out.printf("Yes! %.2f lv left.", priceToys - priceVacation);
         }
         else  {

             System.out.printf("Not enough money! %.2f lv needed.", priceVacation - priceToys);
         }
    }
}
