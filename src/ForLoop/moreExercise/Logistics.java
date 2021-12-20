package ForLoop.moreExercise;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double van = 0;
        double track = 0;
        double train = 0;
        double sum1 =0;
        double sum2 =0;
        double sum3 = 0;
        int allGoods = 0;


        for (int i = 1; i<=n; i++){
            int ton = Integer.parseInt(scanner.nextLine());
            allGoods +=ton;
            if (ton<=3){
                sum1 += ton ;
                van += ton * 200;

            }else if (ton <= 11){
                sum2 += ton;
                track += ton * 175;


            }else {
                sum3 += ton;
                train += ton * 120;

            }


        } double average = ( van + track + train)/allGoods;
        double parcentVan = sum1 / allGoods * 100;
        double parcentTrack = sum2/allGoods * 100;
        double parcentTrain = sum3/allGoods * 100;
        System.out.printf("%.2f\n", average);
        System.out.printf("%.2f%%\n", parcentVan);
        System.out.printf("%.2f%%\n", parcentTrack);
        System.out.printf("%.2f%%", parcentTrain);

    }
}
