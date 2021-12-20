package NestedLoops.moreexercise;

import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = Integer.parseInt(scanner.nextLine());
        int f = Integer.parseInt(scanner.nextLine());

        for (int i = s; i <= f ; i++) {
            for (int j = s; j <= f ; j++) {
                for (int k = s; k <= f ; k++) {
                    for (int l = s; l <= f ; l++) {
                        if (l > i){
                            continue;
                        }if ((j + k) % 2 != 0){
                            continue;
                        }
                        if ((i % 2 == 0 && l % 2 != 0) || (i % 2 != 0 && l % 2 == 0)){
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }else {
                            continue;
                        }

                    }

                }

            }

        }

    }
}
