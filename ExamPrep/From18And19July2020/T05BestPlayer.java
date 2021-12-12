package M01_ProgrammingBasics.ExamPrep.From18And19July2020;

import java.util.Scanner;

public class T05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int maxGoals = Integer.MIN_VALUE;
        String bestPlayer = "";

        while (!input.equals("END")) {
            int scoredGoals = Integer.parseInt(scanner.nextLine());
            if (maxGoals < scoredGoals) {
                maxGoals = scoredGoals;
                bestPlayer = input;
            }
            if (maxGoals >= 10) {
                break;
            }
            input = scanner.nextLine();
        }
        if (maxGoals >= 3) {
            System.out.printf("%s is the best player!\n", bestPlayer);
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("%s is the best player!\n", bestPlayer);
            System.out.printf("He has scored %d goals.", maxGoals);
        }
    }
}