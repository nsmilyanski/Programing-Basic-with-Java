package ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        boolean workingday =day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") ||
                day.equals("Friday");
        boolean weekedn = day.equals("Saturday") || day.equals("Sunday");

        if (workingday) {
            if (fruit.equals("banana")) {
                price = 2.50;
            } else if (fruit.equals("apple")) {
                price = 1.20;
            } else if (fruit.equals("orange")) {
                price =  0.85;
            } else if (fruit.equals("grapefruit")) {
                price =  1.45;
            } else if (fruit.equals("kiwi")) {
                price =  2.70;
            } else if (fruit.equals("pineapple")) {
                price =  5.50;
            } else if (fruit.equals("grapes")) {
                price =  3.85;

            }


        } else if (weekedn) {
            if (fruit.equals("banana")) {
                price = 2.70;
            } else if (fruit.equals("apple")) {
                price =  1.25;
            } else if (fruit.equals("orange")) {
                price =  0.90;
            } else if (fruit.equals("grapefruit")) {
                price =  1.60;
            } else if (fruit.equals("kiwi")) {
                price = 3.00;
            } else if (fruit.equals("pineapple")) {
                price = 5.60;
            } else if (fruit.equals("grapes")) {
                price =  4.20;

            }

        } if (workingday && (fruit.equals("banana") || fruit.equals("apple") || fruit.equals("orange") ||
        fruit.equals("grapefruit") || fruit.equals("kiwi") || fruit.equals("pineapple") || fruit.equals("grapes"))){
           double sum = quantity * price;
            System.out.printf("%.2f", sum);

        } else if (weekedn && (fruit.equals("banana") || fruit.equals("apple") || fruit.equals("orange") ||
                fruit.equals("grapefruit") || fruit.equals("kiwi") || fruit.equals("pineapple") || fruit.equals("grapes" ))){
            double sum = quantity * price;
            System.out.printf("%.2f", sum);
        } else {
            System.out.printf("error");
        }

    }
}

