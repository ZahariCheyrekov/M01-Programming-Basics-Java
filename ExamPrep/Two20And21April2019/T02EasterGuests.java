package M01_ProgrammingBasics.ExamPrep.Two20And21April2019;

import java.util.Scanner;

public class T02EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberGuests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double breadsNeeded = Math.ceil(1.0 * numberGuests / 3);
        int eggs = numberGuests * 2;
        double easterBreadsPrice = breadsNeeded * 4;
        double eggsPrice = eggs * 0.45;
        double total = eggsPrice + easterBreadsPrice;

        if (budget >= total) {
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.\n", breadsNeeded, eggs);
            System.out.printf("He has %.2f lv. left.", budget - total);
        } else {
            System.out.print("Lyubo doesn't have enough money.\n");
            System.out.printf("He needs %.2f lv. more.", total - budget);
        }
    }
}
