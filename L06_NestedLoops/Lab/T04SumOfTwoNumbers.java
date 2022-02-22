package M01_ProgrammingBasics.L06_NestedLoops.Lab;

import java.util.Scanner;

public class T04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        boolean hasFound = false;
        int numberOfCombinations = 0;

        for (int x = startInterval; x <= endInterval; x++) {
            for (int y = startInterval; y <= endInterval; y++) {
                numberOfCombinations++;

                if (y + x == magicNumber) {
                    hasFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", numberOfCombinations, x, y, magicNumber);
                    break;
                }
            }
            if (hasFound) {
                break;
            }
        }
        if (!hasFound) {
            System.out.printf("%d combinations - neither equals %d", numberOfCombinations, magicNumber);
        }
    }
}
