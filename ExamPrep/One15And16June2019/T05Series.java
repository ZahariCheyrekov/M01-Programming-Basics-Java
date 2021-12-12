package M01_ProgrammingBasics.ExamPrep.One15And16June2019;

import java.util.Scanner;

public class T05Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            String seriesName = scanner.nextLine();
            double priceSeries = Double.parseDouble(scanner.nextLine());
            if (seriesName.equals("Thrones")) {
                sum += priceSeries / 2.0;
            } else if (seriesName.equals("Lucifer")) {
                sum += priceSeries * 0.60;
            } else if (seriesName.equals("Protector")) {
                sum += priceSeries * 0.70;
            } else if (seriesName.equals("TotalDrama")) {
                sum += priceSeries * 0.80;
            } else if (seriesName.equals("Area")) {
                sum += priceSeries * 0.90;
            } else {
                sum += priceSeries;
            }
        }
        if (budget >= sum) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - sum);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", sum - budget);
        }
    }
}
