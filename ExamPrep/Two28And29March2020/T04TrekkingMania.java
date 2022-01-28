package M01_ProgrammingBasics.ExamPrep.Two28And29March2020;

import java.util.Scanner;

public class T04TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleInGroup = Integer.parseInt(scanner.nextLine());
        int Musala = 0;
        int Monblan = 0;
        int Kilimanjaro = 0;
        int k2 = 0;
        int Everest = 0;
        int allPeople = 0;

        for (int group = 1; group <= peopleInGroup; group++) {
            int numberOfPeople = Integer.parseInt(scanner.nextLine());
            allPeople += numberOfPeople;

            if (numberOfPeople <= 5) {
                Musala += numberOfPeople;
            } else if (numberOfPeople <= 12) {
                Monblan += numberOfPeople;
            } else if (numberOfPeople <= 25) {
                Kilimanjaro += numberOfPeople;
            } else if (numberOfPeople <= 40) {
                k2 += numberOfPeople;
            }
            if (numberOfPeople >= 41) {
                Everest += numberOfPeople;
            }
        }
        double MusalaPercent = 1.0 * Musala / allPeople * 100;
        double MonblanPercent = 1.0 * Monblan / allPeople * 100;
        double KilimanjaroPercent = 1.0 * Kilimanjaro / allPeople * 100;
        double k2Percent = 1.0 * k2 / allPeople * 100;
        double EverestPercent = 1.0 * Everest / allPeople * 100;

        System.out.printf("%.2f%%\n", MusalaPercent);
        System.out.printf("%.2f%%\n", MonblanPercent);
        System.out.printf("%.2f%%\n", KilimanjaroPercent);
        System.out.printf("%.2f%%\n", k2Percent);
        System.out.printf("%.2f%%", EverestPercent);
    }
}