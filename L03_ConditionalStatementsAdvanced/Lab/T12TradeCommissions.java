package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class T12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double salesVolume = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if (town.equals("Sofia")) {
            if (salesVolume >= 0 && salesVolume <=500) {
                price = salesVolume * 0.05;
                System.out.printf("%.2f", price);
            } else if (salesVolume > 500 && salesVolume <= 1000) {
                price = salesVolume * 0.07;
                System.out.printf("%.2f", price);
            } else if (salesVolume > 1000 && salesVolume <= 10000) {
                price = salesVolume * 0.08;
                System.out.printf("%.2f", price);
            } else if (salesVolume > 10000) {
                price = salesVolume * 0.12;
                System.out.printf("%.2f", price);
            } else {
                System.out.println("error");
            }
        } else if (town.equals("Varna")) {
            if (salesVolume >= 0 && salesVolume <= 500) {
                price = salesVolume * 0.045;
                System.out.printf("%.2f", price);
            } else if (salesVolume > 500 && salesVolume <= 1000) {
                price = salesVolume * 0.075;
                System.out.printf("%.2f", price);
            } else if (salesVolume > 1000 && salesVolume <= 10000) {
                price = salesVolume * 0.10;
                System.out.printf("%.2f", price);
            } else if (salesVolume > 10000) {
                price = salesVolume * 0.13;
                System.out.printf("%.2f", price);
            } else {
                System.out.println("error");
            }
        } else if (town.equals("Plovdiv")) {
            if (salesVolume >= 0 && salesVolume <= 500) {
                price = salesVolume * 0.055;
                System.out.printf("%.2f", price);
            } else if (salesVolume > 500 && salesVolume <= 1000) {
                price = salesVolume * 0.08;
                System.out.printf("%.2f", price);
            } else if (salesVolume > 1000 && salesVolume <= 10000) {
                price = salesVolume * 0.12;
                System.out.printf("%.2f", price);
            } else if (salesVolume >=10000) {
                price = salesVolume * 0.145;
                System.out.printf("%.2f", price);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
