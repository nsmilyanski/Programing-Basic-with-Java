package WhileLoop.lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (num > sum){
          int currentnum = Integer.parseInt(scanner.nextLine());
          sum += currentnum;
        }
        System.out.println(sum);
    }
}
