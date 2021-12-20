package FirststepsinCoding.lab.exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // 1. Дължина в см – цяло число в интервала [10 … 500]
        int lengthCM = Integer.parseInt(scanner.nextLine());
        //2. Широчина в см – цяло число в интервала [10 … 300]
        int widthCM = Integer.parseInt(scanner.nextLine());
        //3. Височина в см – цяло число в интервала [10… 200]
        int heightCM = Integer.parseInt(scanner.nextLine());
        //4. Процент – реално число в интервала [0.000 … 100.000]
        double porcent = Double.parseDouble(scanner.nextLine());

        int volume = lengthCM * widthCM * heightCM;
        double allLiters = volume * 0.001;
        double realporcent = porcent * 0.01;
        double totalLiters = allLiters - allLiters * porcent/100;

        System.out.printf("%.2f",totalLiters);
    }
}
