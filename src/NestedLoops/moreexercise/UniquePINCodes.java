package NestedLoops.moreexercise;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n1; i++) {
            for (int j = 2; j <= n2 ; j++) {
                for (int k = 1; k <= n3 ; k++) {
                    if (i % 2 == 0 && k % 2 == 0 && j != 4 && j !=6 && j <= 7){
                        System.out.printf("%d %d %d\n", i, j, k);
                    }else {
                        continue;
                    }

                }

            }

        }

    }

}
