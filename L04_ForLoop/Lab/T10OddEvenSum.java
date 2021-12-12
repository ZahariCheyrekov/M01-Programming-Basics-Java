package M01_ProgrammingBasics.L04_ForLoop.Lab;

import java.util.Scanner;

public class T10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sumEven = sumEven + num;
            } else {
                sumOdd = sumOdd + num;
            }
        }
        int diff = Math.abs(sumEven - sumOdd);
        if (sumOdd == sumEven) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumEven);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}
