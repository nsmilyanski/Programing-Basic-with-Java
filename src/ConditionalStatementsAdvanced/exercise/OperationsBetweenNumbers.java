package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String chart = scanner.nextLine();
        int input = 0;
        double input2 = 0;
        String evenorOdd = "";
        if (chart.equals("+")){
            input = n1 + n2;
        }else if (chart.equals("-")){
            input = n1 - n2;
        }
        else if (chart.equals("*")){
            input = n1 * n2;
        }else if (chart.equals("/")){
            input2 = (n1 * 1.00) / (n2 * 1.00);

        }else if (chart.equals("%") && n2 !=0 ){
            input = n1 % n2;
        }

        if (input % 2 == 0){
            evenorOdd = "even";
        }else {
            evenorOdd = "odd";
        } if (chart.equals("+") || chart.equals("-") || chart.equals("*")){
            System.out.printf("%d %s %d = %d - %s",n1, chart, n2, input, evenorOdd);
        } else if (chart.equals("%") ){
            if (n2 == 0){
                System.out.printf("Cannot divide %d by zero", n1);
            }else {
                System.out.printf("%d %s %d = %d", n1, chart, n2, input);
            }
        }else if (chart.equals("/") ){
            if (n2 == 0){
                System.out.printf("Cannot divide %d by zero", n1);
            }else {
                System.out.printf("%d %s %d = %.2f ", n1, chart, n2, input2);
            }

        }

    }
}
