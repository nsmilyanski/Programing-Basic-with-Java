package WhileLoop.exercise;

import java.util.Scanner;

public class Cake2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int allPieces = width * length;
        boolean isFinished = false;
        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            int currentPieces = Integer.parseInt(input);
            allPieces -= currentPieces;
            if (allPieces <= 0) {
                isFinished = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isFinished) {
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(allPieces));
        } else {
            System.out.printf("%d pieces are left.", allPieces);
        }
    }
}
