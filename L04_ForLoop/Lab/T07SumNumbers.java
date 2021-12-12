package M01_ProgrammingBasics.L04_ForLoop.Lab;

import java.util.Scanner;

public class T07SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNum;
        }
        System.out.println(sum);
    }
}
