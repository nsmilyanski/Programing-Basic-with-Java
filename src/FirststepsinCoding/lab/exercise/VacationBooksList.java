package FirststepsinCoding.lab.exercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int srt = Integer.parseInt(scanner.nextLine());
        int srtforhours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

         int onebook = srt/srtforhours;
         int total = onebook/days;
         System.out.println(total);
    }
}
