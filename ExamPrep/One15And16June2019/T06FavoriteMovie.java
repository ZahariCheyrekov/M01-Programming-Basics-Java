package M01_ProgrammingBasics.ExamPrep.One15And16June2019;

import java.util.Scanner;

public class T06FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int count = 0;
        int maxAsciiAmount = 0;
        String bestMovie = "";
        while (!movie.equals("STOP")) {
            count++;
            int currentAsciiAmount = 0;
            for (int i = 0; i < movie.length(); i++) {
                char symbol = movie.charAt(i);
                currentAsciiAmount += symbol;
                if (symbol >= 97 && symbol <= 122) {
                    currentAsciiAmount -= 2 * movie.length();
                } else if (symbol >= 65 && symbol <= 90) {
                    currentAsciiAmount -= movie.length();
                }
            }
            if (currentAsciiAmount > maxAsciiAmount) {
                maxAsciiAmount = currentAsciiAmount;
                bestMovie = movie;
            }

            if (count == 7) {
                System.out.println("The limit is reached.");
                break;
            }
            movie = scanner.nextLine();
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, maxAsciiAmount);
    }
}
