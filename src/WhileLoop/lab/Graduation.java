package WhileLoop.lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double poorGrades = 0;
        int sum = 1;
        double sumGrades = 0;

        while (sum <= 12){

                if (poorGrades > 1.0){
                    break;
                }

        double grades = Double.parseDouble(scanner.nextLine());
                if (grades < 4.0){
                    poorGrades++;
                    continue;
                }
            sumGrades += grades;
            sum++;

        }
        double averageGrade =sumGrades/12;
        if (sum >= 12){
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }else {
            System.out.printf("%s has been excluded at %d grade", name, sum);

        }

    }
}
