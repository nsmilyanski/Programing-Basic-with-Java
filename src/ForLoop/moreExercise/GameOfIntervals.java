package ForLoop.moreExercise;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double points = 0;
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        double sum4 = 0;
        double sum5 = 0;
        double sum6 = 0;

        for (int i = 1; i<=n; i++){
            int num = Integer.parseInt(scanner.nextLine());

            if (num >=0 && num < 10){
                sum1++;
                points += num * 0.2;

            }else if (num >= 10 && num < 20){
                sum2++;
                points += num * 0.3;

            }else if (num >= 20 && num < 30){
                sum3++;
                points += num * 0.4;

            }else if (num >= 30 && num < 40){
                sum4++;
                points += 50;

            }else if (num >= 40 && num <= 50){
                sum5++;
                points += 100;

            }else {
                sum6++;
                points = points/2;

            }
        }
        double parcent1 = sum1/n * 100;
        double parcent2 = sum2/n * 100;
        double parcent3 = sum3/n * 100;
        double parcent4 = sum4/n * 100;
        double parcent5 = sum5/n * 100;
        double parcent6 = sum6/n * 100;
        System.out.printf("%.2f\n", points);
        System.out.printf("From 0 to 9: %.2f%%\n", parcent1);
        System.out.printf("From 10 to 19: %.2f%%\n", parcent2);
        System.out.printf("From 20 to 29: %.2f%%\n", parcent3);
        System.out.printf("From 30 to 39: %.2f%%\n", parcent4);
        System.out.printf("From 40 to 50: %.2f%%\n", parcent5);
        System.out.printf("Invalid numbers: %.2f%%\n", parcent6);

    }
}
