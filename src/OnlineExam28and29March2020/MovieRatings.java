package OnlineExam28and29March2020;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numFilms = Integer.parseInt(scanner.nextLine());

        double sumRating = 0;
        double maxRating = Double.NEGATIVE_INFINITY;
        double minRating = Double.POSITIVE_INFINITY;
        String filmMaxRating = "";
        String filmMinRating = "";


        for (int i = 1; i <= numFilms ; i++) {
            String nameFilm = scanner.nextLine();
            double reting = Double.parseDouble(scanner.nextLine());
            sumRating += reting;
            if (reting > maxRating){
                filmMaxRating = nameFilm;
                maxRating = reting;
            }
            if (minRating > reting){
                filmMinRating = nameFilm;
                minRating = reting;
            }


        }
        double averageRating = sumRating / numFilms;
        System.out.printf("%s is with highest rating: %.1f\n", filmMaxRating, maxRating);
        System.out.printf("%s is with lowest rating: %.1f\n", filmMinRating, minRating);
        System.out.printf("Average rating: %.1f", averageRating);


    }
}
