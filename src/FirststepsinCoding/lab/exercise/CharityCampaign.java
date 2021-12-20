package FirststepsinCoding.lab.exercise;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numdays = Integer.parseInt(scanner.nextLine());
        int numshefs = Integer.parseInt(scanner.nextLine());
        int numcakes = Integer.parseInt(scanner.nextLine());
        int numwofles = Integer.parseInt(scanner.nextLine());
        int numpancakes = Integer.parseInt(scanner.nextLine());

        double cake = 45.0;
        double wofle = 5.80;
        double pancake = 3.20;

        double cakesfrom1shef = cake * numcakes;
         double woflesfrom1chef = wofle * numwofles;
         double pancekesfrom1chef = pancake * numpancakes;

         double sumfromallChefs = (cakesfrom1shef + woflesfrom1chef + pancekesfrom1chef) * numshefs;
         double sumgromallCampaign =  sumfromallChefs * numdays;

         double sumafterallPays = sumgromallCampaign - sumgromallCampaign/8;

         System.out.printf("%.2f",sumafterallPays);

    }
}
