package ForLoop.exercise;

import java.util.Scanner;

public class NumbersEndingin7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        for (int i = 1; i<1000; i++){
            if (i % 10 == 7){
                System.out.println(i);
            }
        }
    }

}
