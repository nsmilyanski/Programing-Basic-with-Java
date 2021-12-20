package ForLoop.lab;

import java.util.Scanner;

public class LeftandRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i =0; i<n; i++){
            int sum1 = Integer.parseInt(scanner.nextLine());
            leftSum += sum1;

            }
        for (int i =0; i<n; i++){
            int sum1 = Integer.parseInt(scanner.nextLine());

            rightSum += sum1;
        }
       if (leftSum == rightSum){
           System.out.println("Yes, sum = " + leftSum);

       }else {
           System.out.println("No, diff = " + Math.abs(leftSum - rightSum));
       }

    }
}
