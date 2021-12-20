package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int colums = Integer.parseInt(scanner.nextLine());
        double income = 0;
        if (projection.equals("Premiere")){
            income = rows * colums * 12.00;
        }else if (projection.equals("Normal")){
            income = rows * colums * 7.50;
        }else if (projection.equals("Discount")){
            income = rows * colums * 5.00;
        }
        System.out.printf("%.2f leva", income);
    }
}
