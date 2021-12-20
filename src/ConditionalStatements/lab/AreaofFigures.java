package ConditionalStatements.lab;

import java.util.Scanner;

public class AreaofFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        double area = 0;
        if (type.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());
            area = side*side;
        }else if (type.equals("rectangle")){
            double length = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());
            area = length*width;
        }else if (type.equals("circle")){
            double radios = Double.parseDouble(scanner.nextLine());
            area = Math.PI * radios * radios;
        }else if (type.equals("triangle")){
            double base = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
             area = base * height/2;
        }
        System.out.printf("%.3f", area);
    }
}
