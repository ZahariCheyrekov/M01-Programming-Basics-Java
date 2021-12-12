package M01_ProgrammingBasics.MyExams.From14And15August2021;

import java.util.Scanner;

public class T06SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int numberOfCombinations = 0;

        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c; d--) {
                        if ((a + b + c + d) == (a * b * c * d) && n % 10 == 5) {
                            numberOfCombinations++;
                            if (numberOfCombinations == 1) {
                                System.out.printf("%d%d%d%d\n", a, b, c, d);
                            } else if (numberOfCombinations == 0) {
                                System.out.print("Nothing found");
                            }
                        }
                        if ((a * b * c * d) / (a + b + c + d) == 3 && n % 3 == 0) {
                            numberOfCombinations++;
                            if (numberOfCombinations == 1) {
                                System.out.printf("%d%d%d%d", d, c, b, a);
                            } else if (numberOfCombinations == 0) {
                                System.out.print("Nothing found");
                            }
                        }
                    }
                }
            }
        }
        if (numberOfCombinations == 0) {
            System.out.print("Nothing found");
        }
    }
}