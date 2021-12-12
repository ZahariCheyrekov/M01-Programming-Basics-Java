package M01_ProgrammingBasics.MyExams.From21And22August2021;

import java.util.Scanner;

public class T03PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dessert = scanner.nextLine();
        int numberOfDesserts = Integer.parseInt(scanner.nextLine());
        int day = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (dessert.equals("Cake")) {
            if (day <= 15) {
                price = numberOfDesserts * 24;
            }
            if (day > 15) {
                price = numberOfDesserts * 28.70;
            }
        } else if (dessert.equals("Souffle")) {
            if (day <= 15) {
                price = numberOfDesserts * 6.66;
            }
            if (day > 15) {
                price = numberOfDesserts * 9.80;
            }
        } else if (dessert.equals("Baklava")) {
            if (day <= 15) {
                price = numberOfDesserts * 12.60;
            }
            if (day > 15) {
                price = numberOfDesserts * 16.98;
            }
        }
        if (day <= 22) {
            if (price >= 100 && price <= 200) {
                price = price - price * 0.15;
            } else if (price > 200) {
                price = price - price * 0.25;
            }
        }
        if (day <= 15) {
            price = price - price * 0.10;
        }
        System.out.printf("%.2f", price);
    }
}