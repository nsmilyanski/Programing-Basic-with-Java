package PBOnlineExam18and19July2020.lab;

import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double allTax = 0;

        for (int i = 1; i <= days ; i++) {
        double tax = 0;
            for (int j = 1; j <= hours ; j++) {
                if (i % 2 == 0 && j % 2 != 0){
                    tax += 2.50;
                }else if (i % 2 != 0 && j % 2 == 0){
                    tax += 1.25;
                }else {
                    tax += 1;
                }

            }
            allTax += tax;
            System.out.printf("Day: %d - %.2f leva\n", i, tax);
        }
           System.out.printf("Total: %.2f leva", allTax);
    }
}
