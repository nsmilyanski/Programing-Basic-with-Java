package OnlineExam28and29March2020;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wantsMoney = Double.parseDouble(scanner.nextLine());
        String nameCoctails = scanner.nextLine();
        double allSum = 0;

        while (!nameCoctails.equals("Party!")){
            double priceCoctails = Double.parseDouble(scanner.nextLine());
            double price = priceCoctails * nameCoctails.length();
            if (price % 2 != 0){
                price *= 0.75;
            }
            allSum += price;
            if (allSum >= wantsMoney){
                break;
            }

            nameCoctails = scanner.nextLine();
        }
        if (nameCoctails.equals("Party!")){
            System.out.printf("We need %.2f leva more.\n", wantsMoney - allSum);
            System.out.printf("Club income - %.2f leva.", allSum);
        }else {
            System.out.println("Target acquired.");
            System.out.printf("Club income - %.2f leva.", allSum);
        }
    }
}
