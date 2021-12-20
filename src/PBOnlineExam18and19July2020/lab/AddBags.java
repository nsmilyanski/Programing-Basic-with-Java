package PBOnlineExam18and19July2020.lab;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //  1.	Цената на багаж над 20кг - реално число в диапазона [10.0…80.0]
        double priceOver20kg = Double.parseDouble(scanner.nextLine());
      //  2.	Килограми на багажа – реално число в диапазона [1.0…32.0]
        double kgSuitcase = Double.parseDouble(scanner.nextLine());
       //3.	Дни до пътуването – цяло число в диапазона [1…60]
        int daystotraveling = Integer.parseInt(scanner.nextLine());
        //4.	Брой багажи – цяло число в диапазона [1…10]
        int numSuitcases = Integer.parseInt(scanner.nextLine());
        double extra = 0;

        if (kgSuitcase < 10){
            extra = priceOver20kg * 0.20;
        } else if (kgSuitcase <= 20) {
            extra = priceOver20kg * 0.50;
        }else {
            extra = priceOver20kg;
        }
        if (daystotraveling > 30){
            extra = extra + extra * 0.10;
        }else  if (daystotraveling >= 7){
            extra = extra + extra * 0.15;
        }else {
            extra = extra + extra * 0.40;
        }
        double allSum = extra * numSuitcases;

        System.out.printf("The total price of bags is: %.2f lv.", allSum);

    }
}
