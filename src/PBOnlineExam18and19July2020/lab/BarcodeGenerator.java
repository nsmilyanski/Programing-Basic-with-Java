package PBOnlineExam18and19July2020.lab;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first= Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        int f1 = first % 10;
        first /= 10;
        int f2 = first % 10;
        first /= 10;
        int f3 = first % 10;
        first /= 10;
        int f4 = first % 10;
        int s1 = second % 10;
        second /= 10;
        int s2 = second % 10;
        second /= 10;
        int s3 = second % 10;
        second /= 10;
        int s4 = second % 10;

        for (int i = f4; i <= s4 ; i++) {
            for (int j = f3; j <= s3; j++) {
                for (int k = f2; k <= s2 ; k++) {
                    for (int l = f1; l <= s1 ; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0){
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
