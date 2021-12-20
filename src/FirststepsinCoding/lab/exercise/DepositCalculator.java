package FirststepsinCoding.lab.exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositsum = Double.parseDouble(scanner.nextLine());
        int mounths = Integer.parseInt(scanner.nextLine());
        double porsent = Double.parseDouble(scanner.nextLine())/100;
         double sum = depositsum + mounths * ((depositsum * porsent)/12);

         System.out.println(sum);
    }
}
