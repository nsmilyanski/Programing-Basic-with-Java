package PBOnlineExam18and19July2020.lab;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String player = scanner.nextLine();
        int maxGoal = Integer.MIN_VALUE;
        String bestPlayer = "";

        while (!player.equals("END")){
            String currentplayer = player;
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals >= 10){
                System.out.printf("%s is the best player!\n", currentplayer);
                System.out.printf("\"He has scored %d goals and made a hat-trick !!!", goals);
                break;
            } else if (goals > maxGoal){
                maxGoal = goals;
                if (goals >= 3){
                System.out.printf("%s is the best player!\n", currentplayer);
                System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoal);
                }else {
                   bestPlayer = currentplayer;
                  //  System.out.printf("%s is the best player!\n", currentplayer);
                  //  System.out.printf("He has scored %d goals.", maxGoal);
                }
            }
            player = scanner.nextLine();
        }
    }
}
