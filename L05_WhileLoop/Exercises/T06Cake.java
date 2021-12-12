package M01_ProgrammingBasics.L05_WhileLoop.Exercises;

import java.util.Scanner;

public class T06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakeLength = Integer.parseInt(scanner.nextLine());
        int cakePieces = cakeLength * cakeWidth;

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            int piecesTaken = Integer.parseInt(input);
            cakePieces -= piecesTaken;

            if (cakePieces <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("STOP") && cakePieces >= 0) {
            System.out.printf("%d pieces are left.", cakePieces);
        }

    }
}
