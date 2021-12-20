package ForLoop.lab;

import java.util.Scanner;

public class Numbersequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i =1; i<=num; i++){
            int varialble = Integer.parseInt(scanner.nextLine());
            if (varialble > maxNum){
                maxNum = varialble;
            }  if (varialble < minNum){
                minNum = varialble;
            }

        }
        System.out.println("Max number: " + maxNum);
        System.out.printf("Min number: " + minNum);

    }
}
