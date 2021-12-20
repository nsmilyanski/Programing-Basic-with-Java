package MyExam;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = Integer.parseInt(scanner.nextLine());
        double counterFail = 0;
        double counterBetween34= 0;
        double counterBetween45= 0;
        double counterTop= 0;
        double sumGreed = 0;

        for (int i = 1; i <= numStudents ; i++) {
            double greed = Double.parseDouble(scanner.nextLine());
            sumGreed += greed;
            if (greed >= 2.00 && greed < 3){
                counterFail++;

            }else if (greed < 4){
                counterBetween34++;

            }else if ( greed < 5){
                counterBetween45++;

            }else {
                counterTop++;

            }

        }
        double failStudents = counterFail / numStudents * 100;
        double studentsBetween34 = counterBetween34/numStudents * 100;
        double studentsBetween45 = counterBetween45/numStudents * 100;
        double topStudents = counterTop/numStudents * 100;
        double avareageSum = sumGreed/numStudents;

        System.out.printf("Top students: %.2f%%\n", topStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", studentsBetween45);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", studentsBetween34);
        System.out.printf("Fail: %.2f%%\n", failStudents);
        System.out.printf("Average: %.2f", avareageSum);

    }
}
