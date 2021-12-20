package NestedLoops.exercises;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstSum = Integer.parseInt(scanner.nextLine());
        int secondSum = Integer.parseInt(scanner.nextLine());

        for (int i = firstSum; i <= secondSum ; i++) {
            String curruntNum = "" + i;
            int oodSum = 0;
            int evenSum = 0;
            for (int j = 0; j < curruntNum.length(); j++) {
                int currentDigit = Integer.parseInt("" + curruntNum.charAt(j));
                if (j % 2 == 0){
                    evenSum += currentDigit;
                }else {
                    oodSum += currentDigit;
                }
                if (evenSum == oodSum){
                    System.out.print(i + " ");
                }

            }

        }
    }
}
