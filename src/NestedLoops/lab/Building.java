package NestedLoops.lab;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());
        String input ="";

        for (int i = floors; i >= 1 ; i--) {
            for (int j = 0; j < rooms ; j++) {
                if (i == floors){
                    input = "L";
                }if (i % 2 == 0 && i != floors){
                    input = "O";
                }if (i % 2 != 0 && i != floors){
                    input = "A";
                }
                System.out.printf("%s%d%d ",input, i, j);

            }
            System.out.println();

        }
    }
}
