package OnlineExam28and29March2020;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameTeam = scanner.nextLine();
        int numPlayed = Integer.parseInt(scanner.nextLine());
        double sumScore = 0;
        int counter = 0;
        int counterD = 0;
        int counterL = 0;

        for (int i = 1; i <= numPlayed; i++) {
        String result = scanner.nextLine();
        switch (result){
            case "W":
                counter++;
                sumScore += 3;
                break;
            case "D":
                counterD++;
                sumScore += 1;
                break;
            case "L":
                counterL++;
                sumScore += 0;
                break;
        }

            
        }
        if (numPlayed == 0){
            System.out.printf("%s hasn't played any games during this season.", nameTeam);
        }else {
        System.out.printf("%s has won %.0f points during this season.\n", nameTeam, sumScore);
        System.out.println("Total stats:");
        System.out.printf("## W: %d\n", counter);
        System.out.printf("## D: %d\n", counterD);
        System.out.printf("## L: %d\n", counterL);
        System.out.printf("Win rate: %.2f%%", counter *1.0/(counter + counterD + counterL) * 100);

        }
    }
}
