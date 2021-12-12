package M01_ProgrammingBasics.ExamPrep.One20And21April2019;

import java.util.Scanner;

public class T05EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paintedEggs = Integer.parseInt(scanner.nextLine());
        int maxEggs = Integer.MIN_VALUE;
        String color = "";
        int redEggs = 0;
        int orangeEggs = 0;
        int blueEggs = 0;
        int greenEggs = 0;

        for (int i = 1; i <= paintedEggs; i++) {
            String eggColor = scanner.nextLine();
            if (eggColor.equals("red")) {
                redEggs++;
                if (redEggs > maxEggs) {
                    maxEggs = redEggs;
                    color = "red";
                }
            } else if (eggColor.equals("orange")) {
                orangeEggs++;
                if (orangeEggs > maxEggs) {
                    maxEggs = orangeEggs;
                    color = "orange";
                }
            } else if (eggColor.equals("blue")) {
                blueEggs++;
                if (blueEggs > maxEggs) {
                    maxEggs = blueEggs;
                    color = "blue";
                }
            } else if (eggColor.equals("green")) {
                greenEggs++;
                if (greenEggs > maxEggs) {
                    maxEggs = greenEggs;
                    color = "green";
                }
            }
        }
        System.out.printf("Red eggs: %d\n" +
                "Orange eggs: %d\n" +
                "Blue eggs: %d\n" +
                "Green eggs: %d\n" +
                "Max eggs: %d -> %s", redEggs, orangeEggs, blueEggs, greenEggs, maxEggs, color);
    }
}

