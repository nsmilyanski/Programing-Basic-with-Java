package NestedLoops.lab;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int x1 = 0; x1 <= num; x1++) {
            for (int x2 = 0; x2 <= num; x2++) {
                for (int x3 = 0; x3 <= num; x3++) {
                    int sum = x1 + x2 + x3;
                    if (sum == num){
                        counter++;
                    }

                }

            }

        }
        System.out.println(counter);
    }
}
