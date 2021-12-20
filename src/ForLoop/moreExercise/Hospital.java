package ForLoop.moreExercise;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int period = Integer.parseInt(scanner.nextLine());
        int dovtors = 7;
        int treatedP =0;
        int untreatedP = 0;

        for (int i = 1; i<=period; i++){
            int patient = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0 && untreatedP > treatedP) {
                dovtors++;

            }


            if (patient <= dovtors){
                treatedP += patient;

            }
            if ( patient > dovtors){
                treatedP += dovtors;
                untreatedP +=  patient - dovtors;


            }


        }

        System.out.printf("Treated patients: %d.\n", treatedP);
        System.out.printf("Untreated patients: %d.\n", untreatedP);

    }
}
