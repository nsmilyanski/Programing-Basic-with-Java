package WhileLoop.moreExercises;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int counter = 0;
        int counter1 = 0;
        //char input1 = Character.isAlphabetic(Integer.parseInt(input));

        while (!input.equals("End")){
            if (!Character.isAlphabetic(Integer.parseInt(input))){
               continue;
            }
            if (input.equals("c")  && counter < 1){
                counter++;
                continue;
            }else if (input.equals("o") && counter1 < 1){

            }
            input = scanner.nextLine();
        }
}
}