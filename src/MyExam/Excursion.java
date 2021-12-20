package MyExam;

import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeople = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int numCards = Integer.parseInt(scanner.nextLine());
        int numTickets = Integer.parseInt(scanner.nextLine());

        double sumNights = nights * 20.00;
        double sumCards = numCards * 1.60;
        double sumTickets = numTickets * 6.00;
        double allSumfor1 = sumCards + sumNights + sumTickets;

        double sumforAll = allSumfor1 * numPeople;

        double result = sumforAll + (sumforAll * 0.25);

        System.out.printf("%.2f", result);

    }
}
