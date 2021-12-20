package ForLoop.lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
       int sum = 0;
        for (int i =1; i<=num; i++){
            int plus = Integer.parseInt(scanner.nextLine());
            sum += plus;
        }
        System.out.println(sum);
    }
}
