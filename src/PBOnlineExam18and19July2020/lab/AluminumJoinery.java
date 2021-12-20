package PBOnlineExam18and19July2020.lab;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  1.	Брой дограми – цяло число в интервала [0..1000];
        int numWindows = Integer.parseInt(scanner.nextLine());
        //  2.	Вид на дограмите – текст "90X130" или "100X150" или "130X180" или "200X300";
        String kindWindows = scanner.nextLine();
        //3.	Начин на получаване – текст
        String delivery = scanner.nextLine();
        double priceWindow = 0;

        if (kindWindows.equals("90X130")) {
            priceWindow = 110;
            priceWindow = numWindows * priceWindow;
            if (numWindows > 60) {
                priceWindow *= 0.92;
            } else if (numWindows > 30) {
                priceWindow *= 0.95;

            }

        } else if (kindWindows.equals("100X150")) {
            priceWindow = 140;
            priceWindow = numWindows * priceWindow;
            if (numWindows > 80) {
                priceWindow *= 0.90;
            } else if (numWindows > 40) {
                priceWindow *= 0.94;

            }


        } else if (kindWindows.equals("130X180")) {
            priceWindow = 190;
            priceWindow = numWindows * priceWindow;
            if (numWindows > 50) {
                priceWindow *= 0.88;
            } else if (numWindows > 20) {
                priceWindow *= 0.93;

            }
        } else if (kindWindows.equals("200X300")) {
            priceWindow = 250;
            priceWindow = numWindows * priceWindow;
            if (numWindows > 50) {
                priceWindow *= 0.86;
            } else if (numWindows > 25) {
                priceWindow *= 0.91;


            }

        }
        if (delivery.equals("With delivery")){
            priceWindow = priceWindow + 60;
        }
        if (numWindows > 99){
            priceWindow *= 0.96;
        }
        if (numWindows < 10){
            System.out.println("Invalid order");
        }else {
            System.out.printf("%.2f BGN", priceWindow);
        }
    }
}