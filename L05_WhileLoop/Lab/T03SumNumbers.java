package M01_ProgrammingBasics.L05_WhileLoop.Lab;

import java.util.Scanner;

public class T03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sumNumbers = 0;
        boolean sumEqual = false;

        while (n > sumNumbers) {
            int num = Integer.parseInt(scanner.nextLine());
            sumNumbers += num;

            if (sumNumbers >= n) {
                sumEqual = true;
                break;
            }
        }
        if (sumEqual) {
            System.out.printf("%d", sumNumbers);
        }
    }
}
