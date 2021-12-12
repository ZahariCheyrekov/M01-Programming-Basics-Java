package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class T11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            if (input.equals("banana")) {
                price = amount * 2.70;
                System.out.printf("%.2f", price);
            } else if (input.equals("apple")) {
                price = amount * 1.25;
                System.out.printf("%.2f", price);
            } else if (input.equals("orange")) {
                price = amount * 0.90;
                System.out.printf("%.2f", price);
            } else if (input.equals("grapefruit")) {
                price = amount * 1.60;
                System.out.printf("%.2f", price);
            } else if (input.equals("kiwi")) {
                price = amount * 3.00;
                System.out.printf("%.2f", price);
            } else if (input.equals("pineapple")) {
                price = amount * 5.60;
                System.out.printf("%.2f", price);
            } else if (input.equals("grapes")) {
                price = amount * 4.20;
                System.out.printf("%.2f", price);
            } else {
                System.out.println("error");
            }
        } else if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") ||
                dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") ||
                dayOfWeek.equals("Friday")) {
            if (input.equals("banana")) {
                price = amount * 2.50;
                System.out.printf("%.2f", price);
            } else if (input.equals("apple")) {
                price = amount * 1.20;
                System.out.printf("%.2f", price);
            } else if (input.equals("orange")) {
                price = amount * 0.85;
                System.out.printf("%.2f", price);
            } else if (input.equals("grapefruit")) {
                price = amount * 1.45;
                System.out.printf("%.2f", price);
            } else if (input.equals("kiwi")) {
                price = amount * 2.70;
                System.out.printf("%.2f", price);
            } else if (input.equals("pineapple")) {
                price = amount * 5.50;
                System.out.printf("%.2f", price);
            } else if (input.equals("grapes")) {
                price = amount * 3.85;
                System.out.printf("%.2f", price);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
