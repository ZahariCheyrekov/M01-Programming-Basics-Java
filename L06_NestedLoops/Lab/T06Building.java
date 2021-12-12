package M01_ProgrammingBasics.L06_NestedLoops.Lab;

import java.util.Scanner;

public class T06Building {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int floors = Integer.parseInt(scanner.nextLine());
    int rooms = Integer.parseInt(scanner.nextLine());

    for (int i = floors; i >= 1; i--) {
        for (int r = 0; r < rooms; r++) {

            if (i % 2 == 0 && i != floors) {
                System.out.printf("O%d%d ", i,r);
            } else if (i % 2 == 1 && i != floors) {
                System.out.printf("A%d%d ", i,r);
            }
            if (i == floors) {
                System.out.printf("L%d%d ", i,r);
            }
        }
        System.out.println();
    }
}
}
