package M01_ProgrammingBasics.L04_ForLoop.MoreExercises;

import java.util.Scanner;

public class T03Logistic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLoads = Integer.parseInt(scanner.nextLine());
        int microBuss = 0;
        int truck = 0;
        int train = 0;
        int totalLoadWeight = 0;

        for (int i = 1; i <= numberOfLoads; i++) {
            int loadWeight = Integer.parseInt(scanner.nextLine());
            totalLoadWeight += loadWeight;
            if (loadWeight < 4) {
                microBuss += loadWeight;
            } else if (loadWeight < 12) {
                truck += loadWeight;
            } else {
                train += loadWeight;
            }
        }
        double averagePerTon = 1.0 * (microBuss * 200 + truck * 175 + train * 120) / totalLoadWeight;
        double microBussPercent = 1.0 * microBuss / totalLoadWeight * 100;
        double truckPercent = 1.0 * truck / totalLoadWeight * 100;
        double trainPercent = 1.0 * train / totalLoadWeight * 100;

        System.out.printf("%.2f%n", averagePerTon);
        System.out.printf("%.2f%%%n", microBussPercent);
        System.out.printf("%.2f%%%n", truckPercent);
        System.out.printf("%.2f%%%n", trainPercent);
    }
}
