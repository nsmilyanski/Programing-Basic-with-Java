package ForLoop.moreExercise;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stadion = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        double sum4 = 0;

        for (int i = 1; i<=n; i++){
            String sector = scanner.nextLine();

            switch (sector){
                case "A":
                    sum1++;
                    break;
                case "B":
                    sum2++;
                    break;
                case "V":
                    sum3++;
                    break;
                case "G":
                    sum4++;
                    break;

            }
        }
        double parcent1 = sum1/n * 100;
        double parcent2 = sum2/n * 100;
        double parcent3 = sum3/n * 100;
        double parcent4 = sum4/n * 100;
        double parcent5 = n*1.0/stadion * 100;
        System.out.printf("%.2f%%\n", parcent1);
        System.out.printf("%.2f%%\n", parcent2);
        System.out.printf("%.2f%%\n", parcent3);
        System.out.printf("%.2f%%\n", parcent4);
        System.out.printf("%.2f%%", parcent5);
    }
}
