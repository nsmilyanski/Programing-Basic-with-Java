package ConditionalStatements.lab;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isValid = password.equals("s3cr3t!P@ssw0rd");
        if (isValid){
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong password!");
        }
    }
}
