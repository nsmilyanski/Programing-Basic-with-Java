package NestedLoops.moreexercise;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter1 = scanner.nextLine().charAt(0);
        char letter2 = scanner.nextLine().charAt(0);
        char letter3 = scanner.nextLine().charAt(0);
        int counter = 0;

        for (int i = letter1; i <= letter2 ; i++) {
            for (int j = letter1; j <= letter2; j++) {
                for (int k = letter1; k <= letter2 ; k++) {
                    if (i == letter3 || j == letter3 || k == letter3){
                        continue;
                    }else {
                    System.out.printf("%c%c%c ", i, j, k);
                    }
                    counter++;
                }

            }

        }
                    System.out.print(counter);
    }
}
