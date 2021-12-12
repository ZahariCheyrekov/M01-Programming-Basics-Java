package M01_ProgrammingBasics.L04_ForLoop.Exercises;

import java.util.Scanner;

public class T02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;

            if (num > max) {
                max = num;
            }
        }
        int sumWithoutMaxNumber = sum - max;

        if (sumWithoutMaxNumber == max) {
            System.out.printf("Yes%nSum = %d", max);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(max - sumWithoutMaxNumber));
        }
    }
}
