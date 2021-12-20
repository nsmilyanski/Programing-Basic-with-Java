package WhileLoop.lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int maxNum = Integer.MIN_VALUE;
        while (!num.equals("Stop")){
            int currentnum = Integer.parseInt(num);
            if (currentnum > maxNum){
                maxNum = currentnum;
            }
            num = scanner.nextLine();

        }
        System.out.println(maxNum);
    }
}
