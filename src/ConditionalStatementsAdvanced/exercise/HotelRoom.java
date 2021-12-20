package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int numNights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0;
        double priceApartment =0;
        if (month.equals("May") || month.equals("October")){
            priceStudio = 50;
            priceApartment = 65;
            if (numNights > 7 && numNights <= 14){
                priceStudio *= 0.95;
            }else if (numNights > 14){
                priceStudio *= 0.70;
            }
        }else if (month.equals("June") || month.equals("September")){
            priceStudio = 75.20;
            priceApartment = 68.70;
            if (numNights > 14){
                priceStudio *= 0.80;
            }
        } else if (month.equals("July")||month.equals("August")){
            priceStudio = 76.00;
            priceApartment = 77.00;
        }
        if (numNights > 14){
            priceApartment *= 0.90;
        }
        double sumStudio = priceStudio * numNights;
        double sumApartment = priceApartment * numNights;
        System.out.printf("Apartment: %.2f lv.", sumApartment);
        System.out.printf("\nStudio: %.2f lv.", sumStudio);

    }
}
