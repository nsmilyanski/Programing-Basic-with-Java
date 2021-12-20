package PBOnlineExam18and19July2020.lab;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int pointsRed = 0;
        int pointsOrange = 0;
        int pointsYellow = 0;
        int pointsWhite = 0;
        int pointsBlack = 0;
        int pointsOthers = 0;

        for (int i = 0; i < n; i++) {
            String colourBal = scanner.nextLine();
            if (colourBal.equals("red")){
                pointsRed++;
                points +=5;
            }else if (colourBal.equals("orange")){
                pointsOrange++;
                points += 10;
            }else if (colourBal.equals("yellow")){
                pointsYellow++;
                points += 15;
            } else if (colourBal.equals("white")) {
                pointsWhite++;
                points += 20;
            } else if (colourBal.equals("black")) {
                pointsBlack++;
                points = points/2;
            }else {
                pointsOthers++;
            }

        }
        System.out.printf("Total points: %d\n", points);
        System.out.printf("Points from red balls: %d\n", pointsRed);
        System.out.printf("Points from orange balls: %d\n", pointsOrange);
        System.out.printf("Points from yellow balls: %d\n", pointsYellow);
        System.out.printf("Points from white balls: %d\n", pointsWhite);
        System.out.printf("Other colors picked: %d\n", pointsOthers);
        System.out.printf("Divides from black balls: %d", pointsBlack);

    }
}
