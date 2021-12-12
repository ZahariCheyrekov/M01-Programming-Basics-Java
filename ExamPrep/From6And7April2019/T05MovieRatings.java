package M01_ProgrammingBasics.ExamPrep.From6And7April2019;

import java.util.Scanner;

public class T05MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMovies = Integer.parseInt(scanner.nextLine());
        double maxRating = Double.NEGATIVE_INFINITY;
        String max = "";
        double minRating = Double.POSITIVE_INFINITY;
        String min = "";
        double sumRating = 0;

        for (int movie = 1; movie <= numberOfMovies; movie++) {
            String nameOfMovie = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            sumRating += rating;

            if (rating > maxRating) {
                maxRating = rating;
                max = nameOfMovie;
            } else if (rating < minRating) {
                minRating = rating;
                min = nameOfMovie;
            }
        }
        double averageRating = sumRating / numberOfMovies;

        System.out.printf("%s is with highest rating: %.1f\n", max, maxRating);
        System.out.printf("%s is with lowest rating: %.1f\n", min, minRating);
        System.out.printf("Average rating: %.1f", averageRating);
    }
}