package MyExam;

import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wontsEarn = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int earnedMoney = 0;
        boolean isEarnd = false;

        while (!input.equals("closed")){
            String operation = input;
            String typeOperation = scanner.nextLine();
            if (operation.equals("haircut")){
                if (typeOperation.equals("mens")){
                    earnedMoney += 15;

                }else if (typeOperation.equals("ladies")){
                    earnedMoney += 20;

                }else if (typeOperation.equals("kids")){
                    earnedMoney += 10;

                }

            }else if (operation.equals("color")){
               if (typeOperation.equals("touch up")){
                   earnedMoney += 20;

                }else if (typeOperation.equals("full color")){
                   earnedMoney += 30;

               }
            }
            if (earnedMoney >= wontsEarn){
                isEarnd = true;
                break;
            }
            input = scanner.nextLine();

        }
        if (isEarnd){
        System.out.println("You have reached your target for the day!");
        }else {
            System.out.printf("Target not reached! You need %dlv. more.\n", wontsEarn - earnedMoney);
        }
        System.out.printf("Earned money: %dlv.", earnedMoney);
    }
}
