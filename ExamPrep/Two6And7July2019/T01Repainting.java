package M01_ProgrammingBasics.ExamPrep.Two6And7July2019;

import java.util.Scanner;

public class T01Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double plastic = Double.parseDouble(scanner.nextLine());
        int litersPaint = Integer.parseInt(scanner.nextLine());
        int thinnerLiters = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double plasticPrice = (plastic + 2) * 1.50;
        double paintPrice = (litersPaint + litersPaint * 0.10) * 14.50;
        double thinnerPrice = thinnerLiters * 5;
        double sum = plasticPrice + paintPrice + thinnerPrice + 0.40;
        double workerMoney = (sum * 0.30) * hours;
        double total = workerMoney + sum;

        System.out.printf("Total expenses: %.2f lv.", total);
    }
}
