package ForLoop.exercise;

import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int n = Integer.parseInt(scanner.nextLine());
       double p1 =0;
       double p2 =0;
       double p3 =0;
       double sump1 =0;
       double sump2 =0;
       double sump3 =0;


       for (int i =1; i<=n; i++){
           int number = Integer.parseInt(scanner.nextLine());
           if (number % 4 ==0){
               sump3++;
               p3 = sump3/n * 100;

           } if ( number % 3 == 0){
               sump2++;
               p2 = sump2/n * 100;

           } if (number % 2 == 0){
               sump1++;
               p1 = sump1/n * 100;

           }

       }
        System.out.printf("%.2f%%\n", p1);
        System.out.printf("%.2f%%\n", p2);
        System.out.printf("%.2f%%", p3);

    }
}
