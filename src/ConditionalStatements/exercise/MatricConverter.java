package ConditionalStatements.exercise;

import java.util.Scanner;

public class MatricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num =Double.parseDouble(scanner.nextLine());
        String inputUnit = scanner.nextLine();
        String outputUnit = scanner.nextLine();

        if (inputUnit.equals("mm")){
            num = num/1000;
        }else  if(inputUnit.equals("cm")){
            num = num/100;
        }if (outputUnit.equals("mm")){
            num = num * 1000;
        }else  if(outputUnit.equals("cm")){
            num = num * 100;

        }
        System.out.printf("%.3f", num);
    }
}
