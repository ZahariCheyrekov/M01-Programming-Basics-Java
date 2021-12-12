package M01_ProgrammingBasics.ExamPrep.From2And3May2019;

import java.util.Scanner;

public class T01FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int veganMenus = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chickenMenus * 10.35;
        double fishPrice = fishMenus * 12.40;
        double veganPrice = veganMenus * 8.15;
        double totalPrice = chickenPrice + fishPrice + veganPrice;
        double dessert = totalPrice * 0.20;
        double sum = totalPrice + dessert + 2.50;

        System.out.printf("Total: %.2f", sum);
    }
}