package M01_ProgrammingBasics.ExamPrep.Two28And29March2020;

import java.util.Scanner;

public class T02MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine()); //време , за което изкачва 1 метър

        double georgeNeedsToClimb = distanceInMeters * time;
        double every50m = Math.floor(distanceInMeters / 50) * 30;
        double totalTime = georgeNeedsToClimb + every50m;

        if (totalTime > recordInSeconds) {
            System.out.printf("No! He was %.2f seconds slower.", totalTime - recordInSeconds);
        } else if (totalTime < recordInSeconds) {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        } else {
            System.out.println("No! He was 0.00 seconds slower.");
        }
    }
}
