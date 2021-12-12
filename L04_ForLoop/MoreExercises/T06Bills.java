package M01_ProgrammingBasics.L04_ForLoop.MoreExercises;

import java.util.Scanner;

public class T06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());
        double electricitySum = 0;

        for (int i = 1; i <= months; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
            electricitySum += electricity;
        }
        double water = 20 * months;
        double internet = months * 15;
        double other = electricitySum + water + internet;
        double otherExpenses = other + (other * 0.20);
        double averageForMonth = (electricitySum + water + internet + otherExpenses) / months;

        System.out.printf("Electricity: %.2f lv", electricitySum);
        System.out.printf("%nWater: %.2f lv", water);
        System.out.printf("%nInternet: %.2f lv", internet);
        System.out.printf("%nOther: %.2f lv", otherExpenses);
        System.out.printf("%nAverage: %.2f lv", averageForMonth);
    }
}
