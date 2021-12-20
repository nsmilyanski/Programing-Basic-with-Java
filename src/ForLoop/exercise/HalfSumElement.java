package ForLoop.exercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int numMax = Integer.MIN_VALUE;
        int numMin = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i<n; i++){
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > numMax){
                numMax = number;
            }

        }
        int sumWithaout = sum - numMax;
        if (sumWithaout == numMax){
            System.out.println("Yes\n " +
                    "Sum = " + numMax);
        }else {
            System.out.println("No\n" +
                    "Diff = " + Math.abs(sumWithaout - numMax));
        }


    }
}
