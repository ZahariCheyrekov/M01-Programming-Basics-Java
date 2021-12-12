package M01_ProgrammingBasics.ExamPrep.One6And7July2019;

import java.util.Scanner;

public class T06NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int maxPoints = Integer.MIN_VALUE;
        String player = "";
        int currentPoints = 0;
        String winner = "";

        while (!input.equals("Stop")) {
            int length = input.length();
            currentPoints = 0;

            for (int i = 0; i < length; i++) {
                player = input;
                int asciiNum = input.charAt(i);
                int n = Integer.parseInt(scanner.nextLine());
                if (n == asciiNum) {
                    currentPoints += 10;
                } else {
                    currentPoints += 2;
                }
                if (currentPoints > maxPoints) {
                    maxPoints = currentPoints;
                    winner = input;
                }
                if (currentPoints == maxPoints) {
                    player = input;
                }
            }
            input = scanner.nextLine();
        }
        if (currentPoints == maxPoints) {
            System.out.printf("The winner is %s with %d points!", player, maxPoints);
        } else {
            System.out.printf("The winner is %s with %d points!", winner, maxPoints);
        }
    }
}