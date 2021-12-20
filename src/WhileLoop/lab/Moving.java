package WhileLoop.lab;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String boxes = scanner.nextLine();
        int freeSpace = width * length * height;
        int sumBoxes = 0;

        while (!boxes.equals("Done")){
            int currentNum = Integer.parseInt(boxes);
            sumBoxes += currentNum;
            if (freeSpace <= sumBoxes){
                break;
            }


            boxes = scanner.nextLine();

        }
        if (boxes.equals("Done")){
            System.out.printf("%d Cubic meters left.", freeSpace - sumBoxes);
        }else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(sumBoxes - freeSpace));
        }
    }
}
