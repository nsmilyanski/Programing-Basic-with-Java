package WhileLoop.exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int faildExercise = Integer.parseInt(scanner.nextLine());
        String nameExercise = scanner.nextLine();
        String lastProblem = "";
        int poorGrades = 0;
        double sum = 0;
        int counter = 0;
        boolean isFaild = false;

        while (!nameExercise.equals("Enough")){
            String grades = scanner.nextLine();
            int ngrades = Integer.parseInt(grades);

            if (ngrades <= 4){
                poorGrades++;
                if (poorGrades == faildExercise){
                    isFaild = true;
                    break;
                }
            }

            sum += ngrades;
            counter++;
            lastProblem = nameExercise;
            nameExercise = scanner.nextLine();
        }
        double averageSum = sum/counter;
        if (isFaild){
            System.out.printf("You need a break, %d poor grades.", poorGrades);
        }else {
            System.out.printf("Average score: %.2f\n", averageSum);
            System.out.printf("Number of problems: %d\n", counter);
            System.out.printf("Last problem: %s", lastProblem);
        }

    }
}
