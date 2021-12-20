package ForLoop.lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int odd = 0;
        int even = 0;

        for (int i =1; i<=n; i++){
            int curentNumber = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0){
                even += curentNumber;

            } else {
                odd += curentNumber;
            }
        }if (even == odd){
            System.out.println("Yes\n" +
                    "Sum = " + even);
        }else {
            System.out.println("No\n" +
                    "Diff = " + Math.abs(even-odd));
        }
    }
}
