package PBOnlineExam18and19July2020.lab;

import java.util.Scanner;

public class BarcodeGenerator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1= Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        for (int i = n1; i <= n2 ; i++){
            if (i % 2 == 0){
                break;
            }
            int oddNum = 0;
            for (int j = n1; j <= n2 ; j++) {
                if (j % 2 == 0){
                    System.out.println(i);
                }

            }
        }
    }
}
