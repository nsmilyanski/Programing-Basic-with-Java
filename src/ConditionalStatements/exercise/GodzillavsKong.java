package ConditionalStatements.exercise;

import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budjet = Double.parseDouble(scanner.nextLine());
        int statistics = Integer.parseInt(scanner.nextLine());
        double priceDress =Double.parseDouble(scanner.nextLine());

        double decor = budjet * 0.1;

        if (statistics > 150){
            priceDress *= 0.9 ;
        }
        double sumDress = statistics * priceDress;
        double totalsumFilm = decor + sumDress;
        if (budjet < totalsumFilm){
            double lack = totalsumFilm - budjet;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", lack);
           // double film = budjet - totalsumFilm;
           // System.out.println("Action!");
           // System.out.printf("Wingard starts filming with %.2f leva left.", film);
        }else {
            double film = budjet - totalsumFilm;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", film);
        }
    }
}
