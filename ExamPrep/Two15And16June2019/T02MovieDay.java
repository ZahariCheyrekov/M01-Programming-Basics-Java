package M01_ProgrammingBasics.ExamPrep.Two15And16June2019;

import java.util.Scanner;

public class T02MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moviePictures = Integer.parseInt(scanner.nextLine());
        int numberOfScenes = Integer.parseInt(scanner.nextLine());
        int sceneDuration = Integer.parseInt(scanner.nextLine());

        double placeWork = moviePictures * 0.15;
        double scenesTime = numberOfScenes * sceneDuration;
        double timeNeeded = scenesTime + placeWork;
        double diff = Math.abs(timeNeeded - moviePictures);

        if (timeNeeded <= moviePictures) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", diff);
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", diff);
        }
    }
}
