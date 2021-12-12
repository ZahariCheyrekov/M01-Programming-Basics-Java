package M01_ProgrammingBasics.L02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class T07WordSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        double lag = Math.floor(distanceInMeters / 15) * 12.5;
        double ivanTime = distanceInMeters * timeForOneMeter + lag;
        double failRecord = ivanTime-recordInSeconds;

        if (ivanTime < recordInSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivanTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", failRecord);
        }

    }
}
