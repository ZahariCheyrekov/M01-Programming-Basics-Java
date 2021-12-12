package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class T08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHours = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHours = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examTime = examHours * 60 + examMinutes;
        int arrivalTime = arrivalHours * 60 + arrivalMinutes;
        int diff = examTime - arrivalTime;

        if (diff > 30) {
            System.out.println("Early");
            if (diff > 59) {
                int hours = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }
        } else if (diff < 0) {
            System.out.println("Late");
            int minutesLate = Math.abs(diff);
            if (minutesLate > 59) {
                int hours = minutesLate / 60;
                int minutes = minutesLate % 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            } else {
                System.out.printf("%d minutes after the start", minutesLate);
            }
        } else {
            System.out.println("On time");
            if (diff > 0) {
                System.out.printf("%d minutes before the start", diff);
            }
        }
    }
}

