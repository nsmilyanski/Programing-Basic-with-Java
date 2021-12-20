package NestedLoops.exercises;

import java.util.Scanner;

public class TraintheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double allsumGreed = 0;
        double counter =0;

        while (!input.equals("Finish")){
            String project = input;
            double sumGreed = 0;
            counter++;
            for (int i = 1; i <= n; i++) {
            double greed = Double.parseDouble(scanner.nextLine());
            sumGreed +=greed;
            }
            double avareageSumGreed = sumGreed/n;
            allsumGreed += avareageSumGreed;
            System.out.printf("%s - %.2f.\n", project, avareageSumGreed);

            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", allsumGreed/counter);
    }
}
