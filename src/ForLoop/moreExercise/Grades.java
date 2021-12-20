package ForLoop.moreExercise;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double grades = 0;
        double s1 = 0;
        double s2 = 0;
        double s3 = 0;
        double s4 = 0;

        for (int i = 1; i<=n; i++){
            double studentsGrades = Double.parseDouble(scanner.nextLine());
            grades += studentsGrades;
            if ( studentsGrades >= 2.00 && studentsGrades < 3){
                s1++;

            }else if (studentsGrades >= 3 && studentsGrades < 4){
                s2++;

            }else if (studentsGrades >= 4 && studentsGrades <5){
                s3++;

            }else {
                s4++;

            }

        } double averageGrade = grades/n;
        double parcent1 = s1/ n* 100;
        double parcent2 = s2/ n* 100;
        double parcent3 = s3 / n* 100;
        double parcent4 = s4/ n* 100;

        System.out.printf("Top students: %.2f%%\n", parcent4);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n",  parcent3);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n",  parcent2);
        System.out.printf("Fail: %.2f%%\n", parcent1);
        System.out.printf("Average: %.2f", averageGrade);

    }
}
