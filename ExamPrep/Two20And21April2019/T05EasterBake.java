package M01_ProgrammingBasics.ExamPrep.Two20And21April2019;

import java.util.Scanner;

public class T05EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int easterBreads = Integer.parseInt(scanner.nextLine());
        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;
        int sugarAmount = 0;
        int flourAmount = 0;

        for (int i = 1; i <= easterBreads; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            sugarAmount += sugar;
            if (maxSugar < sugar) {
                maxSugar = sugar;
            }
            int flour = Integer.parseInt(scanner.nextLine());
            flourAmount += flour;
            if (maxFlour < flour) {
                maxFlour = flour;
            }
        }
        double sugarPackets = Math.ceil(1.0 * sugarAmount / 950);
        double flourPackets = Math.ceil(1.0 * flourAmount / 750);

        System.out.printf("Sugar: %.0f\n", sugarPackets);
        System.out.printf("Flour: %.0f\n", flourPackets);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.\n", maxFlour, maxSugar);
    }
}

