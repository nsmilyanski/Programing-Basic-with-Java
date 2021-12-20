package ForLoop.exercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int sum1 = 0;
        int sum2 =0;
        int sum3 = 0;
        int leftFace = 0;
        int leftInst = 0;
        int leftRedd = 0;
        int money = 0;

        for (int i =1; i<=numTabs; i++){
            String websait = scanner.nextLine();
            switch (websait){
                case "Facebook":
                    sum1++;
                    leftFace = sum1 * 150;

                    break;
                case "Instagram":
                    sum2++;
                    leftInst = sum2 * 100;
                    break;
                case "Reddit":
                    sum3++;
                    leftRedd = sum3 * 50;
                    break;
            }


        }
        money = leftFace + leftInst + leftRedd;
        if (money >= salary){
            System.out.println("You have lost your salary.");

        }else {
            int restMoney = salary - money;
            System.out.println(restMoney);
        }

    }
}
