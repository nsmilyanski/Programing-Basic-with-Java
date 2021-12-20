package WhileLoop.moreExercises;

import java.util.Scanner;

public class DishWasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottles =Integer.parseInt(scanner.nextLine());;
        int quantityBottles = bottles * 750;
        int cleanPlain = 0;
        int cleanPot = 0;
        int counter = 0;

        while (quantityBottles >= 0){
            String input = scanner.nextLine();
            if (input.equals("End")){
                break;
            }
            int preparation = Integer.parseInt(input);
            counter++;
            if (counter % 3 == 0){
                cleanPot += preparation;
                quantityBottles -= preparation * 15;
            }else {
                cleanPlain += preparation;
                quantityBottles -= preparation * 5;
            } if (quantityBottles < 0){
                break;
            }
        }
        if (quantityBottles >= 0){
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n", cleanPlain, cleanPot);
            System.out.printf("Leftover detergent %d ml.", quantityBottles);
        }else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(quantityBottles));
        }
    }
}
