package M01_ProgrammingBasics.MyExams.From14And15August2021;

import java.util.Scanner;

public class T03SantaHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String review = scanner.nextLine();
        days = days - 1;
        double price = 0;

        if (roomType.equals("room for one person")) {
            price = days * 18.00;
        } else if (roomType.equals("apartment")) {
            price = days * 25.00;
            if (days < 10) {
                price = price - price * 0.30;
            }
            if (days >= 10 && days <= 15) {
                price = price - price * 0.35;
            }
            if (days > 15) {
                price = price - price * 0.50;
            }
        } else if (roomType.equals("president apartment")) {
            price = days * 35.00;
            if (days < 10) {
                price = price - price * 0.10;
            }
            if (days >= 10 && days <= 15) {
                price = price - price * 0.15;
            }
            if (days > 15) {
                price = price - price * 0.20;
            }
        }
        if (review.equals("positive")) {
            price = price + price * 0.25;
        } else if (review.equals("negative")) {
            price = price - price * 0.10;
        }
        System.out.printf("%.2f", price);
    }
}