package M01_ProgrammingBasics.ExamPrep.Two6And7July2019;

import java.util.Scanner;

public class T02Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videCardsPrice = videoCards * 250;
        double processorPrice = (videCardsPrice * 0.35) * processors;
        double ramPrice = (videCardsPrice * 0.10) * ram;
        double total = videCardsPrice + processorPrice + ramPrice;
        if (videoCards > processors) {
            total = total - total * 0.15;
        }
        double diff = Math.abs(budget - total);

        if (budget >= total) {
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }
    }
}