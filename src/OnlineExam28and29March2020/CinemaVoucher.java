package OnlineExam28and29March2020;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vaucher = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        double sumTicket = 0;
        int counterFilm = 0;
        int counterOthers = 0;

        while (!input.equals("End")) {
            String name = input;
            int l = name.length();
            char firstWord = name.charAt(0);
            char secondWord = name.charAt(1);
            if (l > 8){
                counterFilm++;
                sumTicket = firstWord + secondWord;
            }else {
                counterOthers++;
                sumTicket = firstWord;
            }
            if (sumTicket <= vaucher){
                vaucher = (int) (vaucher - sumTicket);
            }else {
                if (l > 8) {
                    counterFilm--;
                }else {
                    counterOthers--;
                }
                break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("%d\n", counterFilm);
        System.out.printf("%d", counterOthers);
    }
}
