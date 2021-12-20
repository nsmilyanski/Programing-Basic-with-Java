package NestedLoops.exercises;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prime = 0;
        int nonprime = 0;

        String input = scanner.nextLine();
        while (!input.equals("stop")){
            int num = Integer.parseInt(input);
            if (num < 0){
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            if (num > 3 && (num % 2 == 0 || num % 3 == 0)){
                nonprime += num;

            }else {
                prime += num;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n", prime);
        System.out.printf("Sum of all non prime numbers is: %d", nonprime);
    }
}
