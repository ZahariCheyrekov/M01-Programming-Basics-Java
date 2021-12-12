package M01_ProgrammingBasics.L04_ForLoop.MoreExercises;

import java.util.Scanner;

public class T05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moves = Integer.parseInt(scanner.nextLine());
        double result = 0;
        int from0to9 = 0;
        int from10to19 = 0;
        int from20to29 = 0;
        int from30to39 = 0;
        int from40to50 = 0;
        int invalidNumber = 0;

        for (int i = 1; i <= moves; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num >= 0 && num <= 9) {
                result += num * 0.20;
                from0to9++;
            } else if (num >= 10 && num <= 19) {
                result += num * 0.30;
                from10to19++;
            } else if (num >= 20 && num <= 29) {
                result += num * 0.40;
                from20to29++;
            } else if (num >= 30 && num <= 39) {
                result += 50;
                from30to39++;
            } else if (num >= 40 && num <= 50) {
                result += 100;
                from40to50++;
            } else {
                result = result / 2;
                invalidNumber += 1;
            }
        }
        double from0to9Percent = 1.0 * from0to9 / moves * 100;
        double from10to19Percent = 1.0 * from10to19 / moves * 100;
        double from20to29Percent = 1.0 * from20to29 / moves * 100;
        double from30to39Percent = 1.0 * from30to39 / moves * 100;
        double from40to50Percent = 1.0 * from40to50 / moves * 100;
        double invalidNUmberPercent = 1.0 * invalidNumber / moves * 100;

        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", from0to9Percent);
        System.out.printf("From 10 to 19: %.2f%%%n", from10to19Percent);
        System.out.printf("From 20 to 29: %.2f%%%n", from20to29Percent);
        System.out.printf("From 30 to 39: %.2f%%%n", from30to39Percent);
        System.out.printf("From 40 to 50: %.2f%%%n", from40to50Percent);
        System.out.printf("Invalid numbers: %.2f%%", invalidNUmberPercent);
    }
}
