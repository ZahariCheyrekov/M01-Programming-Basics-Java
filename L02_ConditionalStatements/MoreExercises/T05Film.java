package M01_ProgrammingBasics.L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class T05Film {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursNeeded = Integer.parseInt(scanner.nextLine());
        double daysAmount = Integer.parseInt(scanner.nextLine());
        int workersMoreWorking = Integer.parseInt(scanner.nextLine());

        double education = daysAmount - daysAmount / 10;
        double hoursForWorking = education * 8;
        double workersWorkingMore = workersMoreWorking * (2 * daysAmount);
        double totalHours = Math.floor(hoursForWorking + workersWorkingMore);
        double hoursLeft = Math.abs(totalHours-hoursNeeded);

        if (totalHours>=hoursNeeded){
            System.out.printf("Yes!%.0f hours left.", hoursLeft);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", hoursLeft);
        }
    }
}
