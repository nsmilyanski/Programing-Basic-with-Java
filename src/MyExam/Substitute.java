package MyExam;

import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int num4 = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isBreak = false;
        for (int i = num1; i <= 8 ; i++) {
            for (int j = 9; j >= num2 ; j--) {
                for (int k = num3; k <= 8 ; k++) {
                    for (int l = 9; l >= num4 ; l--) {
                        if (i % 2 == 0 && j % 2 != 0 && k % 2 == 0 && l % 2 != 0 ) {
                            if (i == k && j == l){
                                System.out.println("Cannot change the same player.");
                                continue;
                            }
                            counter++;
                            System.out.printf("%d%d - %d%d\n", i, j, k, l);
                            if (counter >= 6){
                                isBreak = true;
                                break;
                            }
                        }else {
                            continue;
                        }
                        
                    }
                    if (isBreak){
                        break;
                    }
                    
                }if (isBreak){
                    break;
                }
                
            }
            if (isBreak){
                break;
            }

        }


    }
}
