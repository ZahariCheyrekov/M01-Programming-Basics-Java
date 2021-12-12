package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class T05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if (town.equals("Sofia")) {
            if (product.equals("coffee")) {
                price = amount * 0.50;
            } else if (product.equals("water")) {
                price = amount * 0.80;
            } else if (product.equals("beer")) {
                price = amount * 1.20;
            } else if (product.equals("sweets")) {
                price = amount * 1.45;
            } else if (product.equals("peanuts")) {
                price = amount * 1.60;
            }
        } else if (town.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                price = amount * 0.40;
            } else if (product.equals("water")) {
                price = amount * 0.70;
            } else if (product.equals("beer")) {
                price = amount * 1.15;
            } else if (product.equals("sweets")) {
                price = amount * 1.30;
            } else if (product.equals("peanuts")) {
                price = amount * 1.50;
            }
        } else if (town.equals("Varna")) {
            if (product.equals("coffee")) {
                price = amount * 0.45;
            } else if (product.equals("water")) {
                price = amount * 0.70;
            } else if (product.equals("beer")) {
                price = amount * 1.10;
            } else if (product.equals("sweets")) {
                price = amount * 1.35;
            } else if (product.equals("peanuts")) {
                price = amount * 1.55;
            }
        }
        System.out.println(price);
    }
}
