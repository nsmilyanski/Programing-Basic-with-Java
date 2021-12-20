package NestedLoops.lab;

import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());


        int counter2 = 0;
        boolean flag = false;

        for (int i = start; i <=end; i++) {
            for (int j = start; j <= end; j++) {
                counter2++;
                int sum = i + j;
                if (sum == magic){
            System.out.printf("Combination N:%d (%d + %d = %d)", counter2,i, j, sum);
                    flag = true;
                    break;

                }

            }
        if (flag){
            break;
        }

        }
        if (!flag){
            System.out.printf("%d combinations - neither equals %d", counter2, magic);
        }
    }
}
