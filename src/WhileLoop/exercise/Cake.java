package WhileLoop.exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int wide = Integer.parseInt(scanner.nextLine());
        int allpices = length * wide;
        boolean isFaild = false;
        String currentSum = scanner.nextLine();
        while(!currentSum.equals("STOP")){
            int sum = Integer.parseInt(currentSum);
            allpices -= sum;
            if (allpices <= 0){
                isFaild = true;
                break;
            }
            currentSum = scanner.nextLine();
        }
        if (isFaild){
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(allpices));
        }else {
            System.out.printf("%d pieces are left.", allpices);
        }
    }
}
