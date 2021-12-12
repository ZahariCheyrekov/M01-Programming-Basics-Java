package M01_ProgrammingBasics.ExamPrep.One9And10March2019;

import java.util.Scanner;

public class T06HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int currentHeight = height - 30;
        int totalJumps = 0;
        boolean failed = false;
        int counterFailed = 0;

        while (counterFailed < 3) {
            int jump = scanner.nextInt();
            totalJumps++;
            if (jump <= currentHeight) {
                counterFailed++;
                if (counterFailed == 3) {
                    failed = true;
                }
            } else {
                if (currentHeight >= height) {
                    break;
                }
                currentHeight += 5;
                counterFailed = 0;
            }
        }
        if (!failed) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", currentHeight, totalJumps);
        } else {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", currentHeight, totalJumps);
        }
    }
}
