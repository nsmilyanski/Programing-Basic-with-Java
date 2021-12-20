package ForLoop.exercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double n = Double.parseDouble(scanner.nextLine());
       double num = 0;
       double p1 =0;
       double p2 = 0;
       double p3 = 0;
       double p4 = 0;
       double p5 = 0;
       double sump1 =0;
       double sump2 =0;
       double sump3 =0;
       double sump4 =0;
       double sump5 =0;


       for (int i= 1; i<=n; i++){
         double number =  Double.parseDouble(scanner.nextLine());
         if (number < 200){
             sump1++;
             p1 = sump1/n * 100;

         } else if (number < 400){
             sump2++;
             p2 = sump2/n * 100;

         }else if (number < 600){
             sump3++;
             p3 = sump3/n * 100;

         }else if (number < 800){
             sump4++;
             p4 = sump4/n * 100;
         }else {
             sump5++;
             p5 = sump5/n * 100;

         }
       }

       System.out.printf("%.2f%%\n", p1);
       System.out.printf("%.2f%%\n", p2);
       System.out.printf("%.2f%%\n", p3);
       System.out.printf("%.2f%%\n", p4);
       System.out.printf("%.2f%%", p5);
    }
}
