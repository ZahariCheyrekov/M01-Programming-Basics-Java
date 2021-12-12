package M01_ProgrammingBasics.ExamPrep.One15And16June2019;

import java.util.Scanner;

public class T02LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seriesName = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double timeForLunch = (double) breakDuration / 8;
        double restTime = (double) breakDuration / 4;
        double timeLeft = breakDuration - timeForLunch - restTime;

        double diff = Math.abs(timeLeft - episodeDuration);
        if (timeLeft >= episodeDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, Math.ceil(diff));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, Math.ceil(diff));
        }
    }
}
