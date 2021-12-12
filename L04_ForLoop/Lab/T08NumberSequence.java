package M01_ProgrammingBasics.L04_ForLoop.Lab;

import java.util.Scanner;

public class T08NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            if (maxNum < numbers) {
                maxNum = numbers;
            }
            if (minNum > numbers) {
                minNum = numbers;
            }
        }
        System.out.println("Max number: " + maxNum);
        System.out.println("Min number: " + minNum);
    }
}
