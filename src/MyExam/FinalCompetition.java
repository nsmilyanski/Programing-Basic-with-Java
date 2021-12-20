package MyExam;

import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDancers = Integer.parseInt(scanner.nextLine());
        double numpoints = Double.parseDouble(scanner.nextLine());
        String seasons = scanner.nextLine();
        String placeofDance = scanner.nextLine();

        double earnSum = numDancers * numpoints;

        if (placeofDance.equals("Bulgaria")){
            if (seasons.equals("summer")){
                earnSum *= 0.95;

            }else if (seasons.equals("winter")){
                earnSum *= 0.92;

            }

        }else if (placeofDance.equals("Abroad")){
            earnSum = earnSum + (earnSum *0.50);
            if (seasons.equals("summer")){
                earnSum *= 0.90;

            }else if (seasons.equals("winter")){
                earnSum *= 0.85;

            }

        }
        double sumCharity = earnSum * 0.75;
        double moneyperDancer = (earnSum - sumCharity) / numDancers;

        System.out.printf("Charity - %.2f\n", sumCharity);
        System.out.printf("Money per dancer - %.2f", moneyperDancer);
    }
}