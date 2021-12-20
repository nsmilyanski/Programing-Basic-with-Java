package FirststepsinCoding.lab.exercise;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rentforRoom = Integer.parseInt(scanner.nextLine());

        double cake = rentforRoom * 20/100;
        double drinks = cake * 55/100;
        double animator = rentforRoom * 1/3;

        double total = rentforRoom + cake + drinks + animator ;
        System.out.println(total);
    }
}
