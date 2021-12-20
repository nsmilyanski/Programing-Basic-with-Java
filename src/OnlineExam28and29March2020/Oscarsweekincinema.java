package OnlineExam28and29March2020;

import java.util.Scanner;

public class Oscarsweekincinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameFilm = scanner.nextLine();
        String kindRoom = scanner.nextLine();
        int salesTickets = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (nameFilm.equals("A Star Is Born")) {
            switch (kindRoom) {
                case "normal":
                    price = 7.50;
                    break;
                case "luxury":
                    price = 10.50;
                    break;
                case "ultra luxury":
                    price = 13.50;
                    break;
            }
        } else if (nameFilm.equals("Bohemian Rhapsody")){
            switch (kindRoom){
                case "normal":
                    price = 7.35;
                    break;
                case "luxury":
                    price = 9.45;
                    break;
                case "ultra luxury":
                    price = 12.75;
                    break;
            }
        }
        else if (nameFilm.equals("Green Book")){
            switch (kindRoom){
                case "normal":
                    price = 8.15;
                    break;
                case "luxury":
                    price = 10.25;
                    break;
                case "ultra luxury":
                    price = 13.25;
                    break;
            }
        } else if (nameFilm.equals("The Favourite")){
            switch (kindRoom){
                case "normal":
                    price = 8.75;
                    break;
                case "luxury":
                    price = 11.55;
                    break;
                case "ultra luxury":
                    price = 13.95;
                    break;
            }
        }
        double result = salesTickets * price;
        System.out.printf("%s -> %.2f lv.", nameFilm, result);
    }
}