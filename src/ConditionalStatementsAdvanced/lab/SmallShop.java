package ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        if ("Sofia".equals(town)) {
            if ("coffee".equals(product)){
                price = 0.50;
                double sum = price * quantity;
                System.out.println(sum);
            } else if ("water".equals(product)){
                price = 0.80;
                double sum = price * quantity;
                System.out.println(sum);
            } else if ("beer".equals(product)){
                price = 1.20;
                double sum = price * quantity;
                System.out.println(sum);
            } else if ("sweets".equals(product)){
                price = 1.45;
                double sum = price * quantity;
                System.out.println(sum);
            }else  if ("peanuts".equals(product)){
                price = 1.60;
                double sum = price * quantity;
                System.out.println(sum);
            }
        } else if ("Plovdiv".equals(town)) {
            if ("coffee".equals(product)) {
                price = 0.40;
                double sum = price * quantity;
                System.out.println(sum);
            } else if ("water".equals(product)) {
                price = 0.70;
                double sum = price * quantity;
                System.out.println(sum);
            } else if ("beer".equals(product)) {
                price = 1.15;
                double sum = price * quantity;
                System.out.println(sum);
            } else if ("sweets".equals(product)) {
                price = 1.30;
                double sum = price * quantity;
                System.out.println(sum);
            } else if ("peanuts".equals(product)) {
                price = 1.50;
                double sum = price * quantity;
                System.out.println(sum);
            }
        }else if ("Varna".equals(town)) {
            if ("coffee".equals(product)){
                price = 0.45;
                double sum = price * quantity;
                System.out.println(sum);
            } else if ("water".equals(product)){
                price = 0.70;
                double sum = price * quantity;
                System.out.println(sum);
            } else if ("beer".equals(product)){
                price = 1.10;
                double sum = price * quantity;
                System.out.println(sum);
            } else if ("sweets".equals(product)){
                price = 1.35;
                double sum = price * quantity;
                System.out.println(sum);
            }else  if ("peanuts".equals(product)){
                price = 1.55;
                double sum = price * quantity;
                System.out.println(sum);
            }
        }
    }
}