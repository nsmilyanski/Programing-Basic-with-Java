package WhileLoop.exercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        int coin = 0;
        sum *= 100;
        double coin1 =0.01;
        double coin2 =0.02;
        double coin3 =0.05;
        double coin4 =0.10;
        double coin5 =0.20;
        double coin6 =0.50;
        double coin7 =1.0;
        double coin8 =2.0;
        while (true){
            if (sum <= coin2){
                coin = 1;
            }else if (sum < coin3){
                coin = 2;
            }else if (sum == coin3 || sum ==coin4 || sum == coin5 || sum == coin6 || sum == coin7 || sum == coin8){
                coin = 1;
            }
        }

    }
}
