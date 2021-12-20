package ForLoop.moreExercise;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inMoney = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        int n1 =0;
        int n2 =0;
        double spend1 = 0;
        double spend2= 0;
        int kidYear = 18;

        for (int i = 1800; i<=year; i++ ){
            if (i % 2 == 0) {
                n1++;
                spend1 = 12000;


            }if (i % 2 !=0){
                n2++;
                kidYear++;
                spend2 = 12000 + 50 * (kidYear);

            }

        }
        //spend2 = 12000 + 50 * (kidYear);
        double allSpend = (n1 * spend1)+(n2 * spend2);
        if (inMoney >= allSpend){
            //System.out.printf("He will need %.2f dollars to survive.", (allSpend - inMoney));
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",
                    inMoney - allSpend);
        }else {
            System.out.printf("He will need %.2f dollars to survive.", (allSpend - inMoney));
        }
    }
}
