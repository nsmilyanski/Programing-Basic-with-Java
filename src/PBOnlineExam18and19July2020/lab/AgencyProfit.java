package PBOnlineExam18and19July2020.lab;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameFlyCompany = scanner.nextLine();
        int numTicketOld = Integer.parseInt(scanner.nextLine());
        int numTicketKids = Integer.parseInt(scanner.nextLine());
        double priceTicketOld = Double.parseDouble(scanner.nextLine());
        double service = Double.parseDouble(scanner.nextLine());

        double priceTicketKids = priceTicketOld * 0.3;
        double oldSum = priceTicketOld + service;
        double kidsSum = priceTicketKids + service;

        double allTickets = (numTicketOld * oldSum) + (numTicketKids * kidsSum);
        double money = allTickets * 0.2;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", nameFlyCompany, money);
    }
}
