package OnlineExam28and29March2020;

import java.util.Scanner;

public class Oscarsceremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rent = Double.parseDouble(scanner.nextLine());

        double statue = rent * 0.7;
        double catering = statue * 0.85;
        double music = catering / 2;

        double result = rent + statue + catering + music;

        System.out.printf("%.2f", result);
    }
}
