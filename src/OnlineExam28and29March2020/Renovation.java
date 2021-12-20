package OnlineExam28and29March2020;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height =Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int litersPaint = Integer.parseInt(scanner.nextLine());
        String porcenNotpaint = scanner.nextLine();
        double allWalls = height * width *4;
        double allfofPaint =allWalls - (allWalls * litersPaint/100);
        double leftPaint =0;

        while (!porcenNotpaint.equals("Tired!")){
            int painted = Integer.parseInt(porcenNotpaint);
        allfofPaint = allfofPaint - painted;
            if (allfofPaint <= 0){
                break;
            }
            porcenNotpaint = scanner.nextLine();

        }
        if (porcenNotpaint.equals("Tired!")){
            System.out.printf("%.0f quadratic m left.\n", allfofPaint);
        }else if (allfofPaint != 0){
            System.out.printf("All walls are painted and you have %.0f l paint left!\n", Math.abs(allfofPaint));
        }else {
            System.out.println("All walls are painted! Great job, Pesho!");
        }

    }
}
