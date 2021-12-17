package M01_ProgrammingBasics.ExamPrep.Two6And7July2019;

import java.util.Scanner;

public class T06TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double max = Double.NEGATIVE_INFINITY;
        String mostPowerfulWord = "";
        double currentWordSum = 0;
        double result = 0;

        while (!input.equals("End of words")) {
            int length = input.length();
            currentWordSum = 0;

            for (int i = 0; i < length; i++) {
                int asciiNum = input.charAt(i);
                currentWordSum += asciiNum;
            }
            if (input.charAt(0) == 'a' || input.charAt(0) == 'e' || input.charAt(0) == 'i' || input.charAt(0) == 'o'
                    || input.charAt(0) == 'u' || input.charAt(0) == 'y' ||
                    input.charAt(0) == 'A' || input.charAt(0) == 'E' || input.charAt(0) == 'I' || input.charAt(0) == 'O'
                    || input.charAt(0) == 'U' || input.charAt(0) == 'Y') {
                result = currentWordSum * length;

            } else {
                result = currentWordSum / length;
            }
            if (result > max) {
                max = result;
                mostPowerfulWord = input;
            }
            input = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f", mostPowerfulWord, max);
    }
}