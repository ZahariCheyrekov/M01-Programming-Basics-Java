package M01_ProgrammingBasics.L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class T05ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int freeTables = Integer.parseInt(scanner.nextLine());
        int tableCounter = 0;

        for (int m = 1; m <= men; m++) {
            for (int f = 1; f <= women; f++) {
                System.out.printf("(%d <-> %d) ", m, f);
                tableCounter++;
                if (tableCounter == freeTables) {
                    return;
                }
            }
        }
    }
}
