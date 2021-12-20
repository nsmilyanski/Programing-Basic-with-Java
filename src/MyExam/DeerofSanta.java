package MyExam;

import java.util.Scanner;

public class DeerofSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayleef = Integer.parseInt(scanner.nextLine());
        int footKg = Integer.parseInt(scanner.nextLine());
        double foodPerday1deer = Double.parseDouble(scanner.nextLine());
        double foodPerday2deer = Double.parseDouble(scanner.nextLine());
        double foodPerday3deer = Double.parseDouble(scanner.nextLine());

        double needFood1 = foodPerday1deer * dayleef;
        double needFood2 = foodPerday2deer * dayleef;
        double needFood3 = foodPerday3deer * dayleef;

        double allNeededFood = needFood1 + needFood2 + needFood3;

        if (footKg > allNeededFood){
            double result1 =  footKg - allNeededFood;
            System.out.printf("%.0f kilos of food left.", Math.floor(result1));
        }else {
            double result2 = allNeededFood - footKg;
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(result2));
        }

    }
}
