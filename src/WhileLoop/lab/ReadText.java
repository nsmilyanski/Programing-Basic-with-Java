package WhileLoop.lab;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comand = scanner.nextLine();

        while (!comand.equals("Stop")){
            System.out.println(comand);

            comand = scanner.nextLine();
        }
    }
}
