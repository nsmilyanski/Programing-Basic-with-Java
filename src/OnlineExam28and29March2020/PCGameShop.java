package OnlineExam28and29March2020;

import java.util.Scanner;

public class PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double counterHeart = 0;
        double counterFornite = 0;
        double counterOverwatch = 0;
        double counterOthers = 0;

        for (int i = 1; i <= num ; i++) {
            String game = scanner.nextLine();
            switch (game){
                case "Hearthstone":
                    counterHeart++;
                    break;
                case "Fornite":
                    counterFornite++;
                    break;
                case "Overwatch":
                    counterOverwatch++;
                    break;
                default:
                    counterOthers++;
                    break;
            }

        }
        double allSum = counterFornite + counterHeart + counterOthers + counterOverwatch;
        System.out.printf("Hearthstone - %.2f%%\n", counterHeart/ allSum * 100);
        System.out.printf("Fornite - %.2f%%\n", counterFornite/ allSum * 100);
        System.out.printf("Overwatch - %.2f%%\n", counterOverwatch/ allSum * 100);
        System.out.printf("Others - %.2f%%", counterOthers/ allSum * 100);
    }
}
