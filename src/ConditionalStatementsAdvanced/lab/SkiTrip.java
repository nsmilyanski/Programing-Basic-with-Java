package ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysinHotel = Integer.parseInt(scanner.nextLine());
        String kindofRoom = scanner.nextLine();
        String evaluation = scanner.nextLine();

        int nights = daysinHotel - 1;
        double sumroomfor1Person = nights * 18.00;
        double sumApartment = nights * 25.00;
        double sumPresident = nights * 35.00;

        if (kindofRoom.equals("room for one person")){
            sumroomfor1Person = sumroomfor1Person * 1;
         System.out.println();
        } else if (kindofRoom.equals("apartment")){
            if (daysinHotel < 10){
                sumApartment = sumApartment * 0.7;

            }else if (daysinHotel <= 15){
                sumApartment = sumApartment * 0.65;

            }else {
                sumApartment = sumApartment * 0.50;

            }

        }else if (kindofRoom.equals("president apartment")){
            if (daysinHotel < 10){
                sumPresident = sumPresident * 0.9;

            }else if (daysinHotel <=15){
                sumPresident = sumPresident * 0.85;

            }else {
                sumPresident = sumPresident * 0.80;

            }

        } if (evaluation.equals("positive")){
            if (kindofRoom.equals("room for one person")){
                sumroomfor1Person = sumroomfor1Person + (sumroomfor1Person * 0.25);
                System.out.printf("%.2f", sumroomfor1Person);
            }else if (kindofRoom.equals("apartment")){
                sumApartment = sumApartment + (sumApartment * 0.25);
                System.out.printf("%.2f", sumApartment);
            }else if (kindofRoom.equals("president apartment")){
                sumPresident = sumPresident + (sumPresident * 0.25);
                System.out.printf("%.2f", sumPresident);
            }

        } else if (evaluation.equals("negative")){
            if (kindofRoom.equals("room for one person")){
                sumroomfor1Person = sumroomfor1Person * 0.90;
                System.out.printf("%.2f", sumroomfor1Person);
            }else if (kindofRoom.equals("apartment")){
                sumApartment = sumApartment * 0.90;
                System.out.printf("%.2f", sumApartment);
            }else if (kindofRoom.equals("president apartment")){
                sumPresident = sumPresident *0.90;
                System.out.printf("%.2f", sumPresident);
            }


        }
    }

}
