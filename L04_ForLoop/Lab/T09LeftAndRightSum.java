package M01_ProgrammingBasics.L04_ForLoop.Lab;

import java.util.Scanner;

public class T09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum1 += num;
        }
        for (int i = 0; i < n; i++) {
            int num2 = Integer.parseInt(scanner.nextLine());
            sum2 += num2;
        }
        int diff = Math.abs(sum2 - sum1);

        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d", sum1);
        } else {
            System.out.printf("No, diff = %d", diff);
        }
    }
}
