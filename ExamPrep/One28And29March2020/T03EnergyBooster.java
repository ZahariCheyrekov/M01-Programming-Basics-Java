package M01_ProgrammingBasics.ExamPrep.One28And29March2020;

import java.util.Scanner;

public class T03EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int numberSets = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (fruit.equals("Watermelon")) {
            if (size.equals("small")) {
                price = 2 * numberSets * 56;
            } else if (size.equals("big")) {
                price = 5 * numberSets * 28.70;
            }
        } else if (fruit.equals("Mango")) {
            if (size.equals("small")) {
                price = 2 * numberSets * 36.66;
            } else if (size.equals("big")) {
                price = 5 * numberSets * 19.60;
            }
        } else if (fruit.equals("Pineapple")) {
            if (size.equals("small")) {
                price = 2 * numberSets * 42.10;
            } else if (size.equals("big")) {
                price = 5 * numberSets * 24.80;
            }
        } else if (fruit.equals("Raspberry")) {
            if (size.equals("small")) {
                price = 2 * numberSets * 20;
            } else if (size.equals("big")) {
                price = 5 * numberSets * 15.20;
            }
        }
        if (price >= 400 && price <= 1000) {
            price = price - price * 0.15;
        } else if (price > 1000) {
            price = price - price * 0.50;
        }
        System.out.printf("%.2f lv.", price);
    }
}