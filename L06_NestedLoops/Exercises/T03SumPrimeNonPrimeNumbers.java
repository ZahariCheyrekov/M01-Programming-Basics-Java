package M01_ProgrammingBasics.L06_NestedLoops.Exercises;

import java.util.Scanner;

public class T03SumPrimeNonPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sumOfPrimeNum = 0;
        int sumOfNonPrimeNum = 0;

        while (!input.equals("stop")) {
            int n = Integer.parseInt(input);
            boolean isPrime = true;

            if (n == 1) {
                isPrime = false;
            }
            if (n < 0) {
                System.out.println("Number is negative.");
            } else {
                for (int i = 2; i <= n / 2; ++i) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    sumOfPrimeNum += n;
                } else {
                    sumOfNonPrimeNum += n;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d", sumOfPrimeNum);
        System.out.printf("%nSum of all non prime numbers is: %d", sumOfNonPrimeNum);
    }
}
