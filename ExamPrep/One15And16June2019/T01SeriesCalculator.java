package M01_ProgrammingBasics.ExamPrep.One15And16June2019;

import java.util.Scanner;

public class T01SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double durationEpisode = Double.parseDouble(scanner.nextLine());

        double addTime = durationEpisode * 0.20;
        double episodeDuration = addTime + durationEpisode;
        double specialEpisodes = seasons * 10;
        double totalTime = episodeDuration * episodes * seasons + specialEpisodes;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", movieName, totalTime);
    }
}
