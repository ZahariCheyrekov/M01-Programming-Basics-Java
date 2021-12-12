package M01_ProgrammingBasics.ExamPrep.One6And7July2019;

import java.util.Scanner;

public class T03CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String sugarAmount = scanner.nextLine();
        int numberDrinks = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (product.equals("Espresso")) {
            if (sugarAmount.equals("Without")) {
                price = price + numberDrinks * 0.90;
                price = price - price * 0.35;
            } else if (sugarAmount.equals("Normal")) {
                price = price + numberDrinks * 1.00;
            } else if (sugarAmount.equals("Extra")) {
                price = price + numberDrinks * 1.20;
            }
            if (numberDrinks >= 5) {
                price = price - price * 0.25;
            }
        } else if (product.equals("Cappuccino")) {
            if (sugarAmount.equals("Without")) {
                price = price + numberDrinks * 1.00;
                price = price - price * 0.35;
            } else if (sugarAmount.equals("Normal")) {
                price = price + numberDrinks * 1.20;
            } else if (sugarAmount.equals("Extra")) {
                price = price + numberDrinks * 1.60;
            }
        } else if (product.equals("Tea")) {
            if (sugarAmount.equals("Without")) {
                price = price + numberDrinks * 0.50;
                price = price - price * 0.35;
            } else if (sugarAmount.equals("Normal")) {
                price = price + numberDrinks * 0.60;
            } else if (sugarAmount.equals("Extra")) {
                price = price + numberDrinks * 0.70;
            }
        }
        if (price > 15) {
            price = price - price * 0.20;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", numberDrinks, product, price);
    }
}