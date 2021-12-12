package M01_ProgrammingBasics.ExamPrep.One20And21April2019;

import java.util.Scanner;

public class T02EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guests = Integer.parseInt(scanner.nextLine());
        double covertPrice = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        if (guests >= 10 && guests <= 15) {
            covertPrice *= 0.85;
        } else if (guests > 15 && guests <= 20) {
            covertPrice *= 0.80;
        } else if (guests > 20) {
            covertPrice *= 0.75;
        }
        double cakePrice = budget * 0.10;
        double totalSum = (guests * covertPrice) + cakePrice;
        double diff = Math.abs(totalSum - budget);

        if (totalSum <= budget) {
            System.out.printf("It is party time! %.2f leva left.", diff);
        } else {
            System.out.printf("No party! %.2f leva needed.", diff);
        }
    }
}
