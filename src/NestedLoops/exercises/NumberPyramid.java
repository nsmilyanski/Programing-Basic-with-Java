package NestedLoops.exercises;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int currentNum = 1;
        boolean isValid = false;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i ; j++) {
                if (currentNum > n){
                    isValid = true;
                    break;
                }
                System.out.printf(currentNum + " ");
                currentNum++;
            }
            if (isValid){
                break;
            }
                System.out.println();

        }
    }
}
