package WhileLoop.exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String book =scanner.nextLine();

        String currentBook = scanner.nextLine();
        int counter = 0;

        while (!currentBook.equals(book)){
            if (currentBook.equals("No More Books")){
                break;
            }
            counter++;
            currentBook = scanner.nextLine();

        }
        if (currentBook.equals("No More Books")){
            System.out.printf("The book you search is not here!\n" +
                    "You checked %d books.", counter);
        }else {
            System.out.printf("You checked %d books and found it.", counter);
        }
    }
}
