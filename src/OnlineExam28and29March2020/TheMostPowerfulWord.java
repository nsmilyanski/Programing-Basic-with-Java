package OnlineExam28and29March2020;

import java.util.Locale;
import java.util.Scanner;

public class TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int counter = 0;
        double maxValue =Double.NEGATIVE_INFINITY;
        double mostPowerfulWord = 0;
        String theWord = "";

        while (!word.equals("End of words")){
            int sumSymbols = 0;
            for (int i = 0; i < word.length(); i++) {
                int symbol = word.charAt(i);
                sumSymbols += symbol;
            }
            char firstSymbol = word.toLowerCase().charAt(0);
            if (firstSymbol == 'a' || firstSymbol == 'e' || firstSymbol == 'i' || firstSymbol == 'o'||
            firstSymbol == 'y' || firstSymbol == 'u'){
                mostPowerfulWord = sumSymbols * word.length();
                if (maxValue < mostPowerfulWord){
                    theWord = word;
                    maxValue = mostPowerfulWord;
                }

            }else {
                mostPowerfulWord =  Math.abs(sumSymbols * 1.0/word.length());
                if (maxValue < mostPowerfulWord){
                    theWord = word;
                    maxValue = mostPowerfulWord;
                }
            }

            word = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f",theWord, maxValue);
    }
}
