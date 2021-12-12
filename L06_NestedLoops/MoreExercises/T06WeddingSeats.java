package M01_ProgrammingBasics.L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class T06WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char sector = scanner.nextLine().charAt(0);
        int rows = Integer.parseInt(scanner.nextLine());
        int seats = Integer.parseInt(scanner.nextLine());

        int factor = 0;
        int counter = 0;

        for (char i = 'A'; i <= sector; i++, rows++) {
            for (int j = 1; j <= rows; j++) {
                factor = (j % 2 == 0) ? 2 : 0;
                for (char k = 'a'; k < 'a' + seats + factor; k++) {
                    System.out.printf("%c%d%c%n", i, j, k);
                    counter++;
                }
            }
        }
        System.out.printf("%d", counter);
    }
}