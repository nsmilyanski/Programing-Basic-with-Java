package OnlineExam28and29March2020;

import java.util.Scanner;

public class TournamentofChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double allMoney = 0;
        double moneyLose = 0;
        int counterWin = 0;
        int counterLose = 0;

       for (int i = 1; i <= n; i++){
            String sport = scanner.nextLine();
            boolean endofDay = false;
            double moneyWin = 0;
            int counter1 = 0;
            int counter2 = 0;
            while (!sport.equals("Finish")){
            String greed = scanner.nextLine();
                if (greed.equals("win")){
                    counter1++;
                    counterWin++;
                    moneyWin += 20;
                }else if (greed.equals("lose")){
                    counter2++;
                    counterLose++;
                    moneyLose = 0;
                }
                if (counter1 > counter2){
                    endofDay = true;
                }

                sport = scanner.nextLine();
            }
            if (endofDay){
                moneyWin = moneyWin + moneyWin * 0.10;
            allMoney += moneyWin;
            }else {
                allMoney += moneyWin;
            }
        }
       if (counterWin > counterLose){
           allMoney = allMoney + allMoney * 0.20;
           System.out.printf("You won the tournament! Total raised money: %.2f", allMoney);

       }else {
           System.out.printf("You lost the tournament! Total raised money: %.2f", allMoney);

       }
    }
}
