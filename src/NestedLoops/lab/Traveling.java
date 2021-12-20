package NestedLoops.lab;

import java.util.Scanner;

public class Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")){
            String newDestination = destination;
        double neededMoney = Double.parseDouble(scanner.nextLine());

        double allSaved = 0;
        while (allSaved < neededMoney){
        double savedMoney = Integer.parseInt(scanner.nextLine());
                allSaved =allSaved + savedMoney;

            }
        System.out.printf("Going to %s!\n", newDestination);

            destination = scanner.nextLine();
        }

    }
}
