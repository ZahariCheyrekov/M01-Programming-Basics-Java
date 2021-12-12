package M01_ProgrammingBasics.ExamPrep.Two20And21April2019;

import java.util.Scanner;

public class T06EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfClients = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double price = 0;

        for (int i = 1; i <= numberOfClients; i++) {
            price = 0;
            int numberOfProductsPerClient = 0;
            String input = scanner.nextLine();

            while (!input.equals("Finish")) {
                numberOfProductsPerClient++;
                if (input.equals("basket")) {
                    price += 1.50;
                } else if (input.equals("wreath")) {
                    price += 3.80;
                } else if (input.equals("chocolate bunny")) {
                    price += 7;
                }
                input = scanner.nextLine();
            }
            if (numberOfProductsPerClient % 2 == 0) {
                price = price - price * 0.20;
                sum += price;
            } else {
                sum += price;
            }
            System.out.printf("You purchased %d items for %.2f leva.\n", numberOfProductsPerClient, price);
        }
        if (numberOfClients == 1) {
            System.out.printf("Average bill per client is: %.2f leva.\n", price);
        } else {
            System.out.printf("Average bill per client is: %.2f leva.\n", sum / numberOfClients);

        }
    }
}