package ForLoop.moreExercise;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double electricity =0;
        double water = 0;
        double net = 0;
        double others = 0;

        for (int i =1; i<=n; i++){
            double energy = Double.parseDouble(scanner.nextLine());
            electricity += energy;
            water +=20;
            net +=15;
            others = (electricity + water + net) + 0.2 * (electricity + water + net);

        }
        double average = (electricity + water + net + others)/n;
        System.out.printf("Electricity: %.2f lv\n", electricity);
        System.out.printf("Water: %.2f lv\n", water);
        System.out.printf("Internet: %.2f lv\n", net);
        System.out.printf("Other: %.2f lv\n", others);
        System.out.printf("Average: %.2f lv", average);
    }
}
