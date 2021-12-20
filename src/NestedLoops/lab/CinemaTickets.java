package NestedLoops.lab;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filmsName = scanner.nextLine();
        double countStudent1 = 0;
        double countStandard1 = 0;
        double countKid1 = 0;
        double allSum1 = 0;

        while (!filmsName.equals("Finish")){
            String curName = filmsName;
        int freeSpots = Integer.parseInt(scanner.nextLine());
        String typeFilm = scanner.nextLine();
        int counterStudent = 0;
        int counterStandard = 0;
        int counterKid = 0;
        while (!typeFilm.equals("End")){
            if (typeFilm.equals("student")){
                countStudent1++;
                counterStudent++;
            } else if (typeFilm.equals("standard")){
                countStandard1++;
                counterStandard++;
            }else if (typeFilm.equals("kid")){
                countKid1++;
                counterKid++;
            }
            if (freeSpots == counterKid+counterStudent + counterStandard){
                break;
            }
                typeFilm = scanner.nextLine();
        }
        double allSum = 1.00 * (counterKid + counterStandard + counterStudent);
        allSum1 = countKid1 + countStandard1 + countStudent1;
        System.out.printf("%s - %.2f%% full.\n", curName, allSum/freeSpots * 100);
        filmsName = scanner.nextLine();
        }
        System.out.printf("Total tickets: %.0f\n", allSum1);
        System.out.printf("%.2f%% student tickets.\n", countStudent1/ allSum1 * 100);
        System.out.printf("%.2f%% standard tickets.\n", countStandard1/ allSum1 * 100);
        System.out.printf("%.2f%% kids tickets.",countKid1/ allSum1 * 100);
    }
}
