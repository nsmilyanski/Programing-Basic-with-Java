package ConditionalStatements.exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordsSeconds = Double.parseDouble(scanner.nextLine());
        double recordsMeaters = Double.parseDouble(scanner.nextLine());
        double timeforMeater = Double.parseDouble(scanner.nextLine());

        double timeforSwiming = recordsMeaters * timeforMeater;
        double delay = Math.floor(recordsMeaters/15) * 12.5;
        double totalTime = delay + timeforSwiming;

        if (recordsSeconds > totalTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }else {
            double faild = totalTime - recordsSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", faild);
        }
    }
}
