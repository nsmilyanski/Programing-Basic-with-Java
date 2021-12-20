package NestedLoops.lab;

import java.util.Scanner;

public class Travel2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String destination = input;
            double price = Double.parseDouble(scanner.nextLine());

            double sum = 0;
            while (sum < price) {
                double amount = Double.parseDouble(scanner.nextLine());
                sum = sum + amount;
            }

            System.out.printf("Going to %s!%n", destination);

            input = scanner.nextLine();
        }
    }
}

