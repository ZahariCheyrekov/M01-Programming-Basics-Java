package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class T07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        if (!input.equals("Sunday")) {
            if (hour >= 10 && hour <= 18) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else {
            System.out.println("closed");
        }
    }
}
