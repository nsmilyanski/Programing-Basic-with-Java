package ConditionalStatements.exercise;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if ( minutes >= 45){
            hours += 1;
        }if (hours >= 24 ){
            hours = 0;

        }if (minutes >= 60){
          minutes = 0;
        }if ( minutes <= 44){
            minutes += 15;
        } else if (minutes >= 44){
            minutes %= 15;
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}
