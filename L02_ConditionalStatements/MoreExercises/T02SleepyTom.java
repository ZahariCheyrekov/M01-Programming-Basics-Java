package M01_ProgrammingBasics.L02_ConditionalStatements.MoreExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class T02SleepyTom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int restDays = Integer.parseInt(scanner.nextLine());

        int workdays = 365 - restDays;
        int restDaysPlayMinutes = restDays * 127;
        int workDaysPlayMinutes = workdays * 63;
        int totalPlayTimeInMinutes = restDaysPlayMinutes + workDaysPlayMinutes;
        double minutesLeft = Math.abs(30_000 - totalPlayTimeInMinutes);
        double inHours = Math.floor(minutesLeft / 60);
        double minutes = minutesLeft % 60;

        DecimalFormat df = new DecimalFormat("#");
        String formatted = df.format(inHours);
        String formattedMinutes = df.format(minutes);

        if (totalPlayTimeInMinutes < 30000) {
            System.out.println("Tom sleeps well");
            System.out.print(formatted + " hours and ");
            System.out.print(formattedMinutes + " minutes less for play");
        } else {
            System.out.println("Tom will run away");
            System.out.print(formatted + " hours and ");
            System.out.print(formattedMinutes + " minutes more for play");

        }
    }

}
