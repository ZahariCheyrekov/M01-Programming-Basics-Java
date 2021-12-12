package M01_ProgrammingBasics.L01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class T05BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roomTax = Integer.parseInt(scanner.nextLine());

        double cakePrice = roomTax * 0.20;
        double drinksPrice = cakePrice * 0.55;
        int animatorPrice = roomTax / 3;

        double totalSum = roomTax + cakePrice +
                drinksPrice + animatorPrice;

        System.out.println(totalSum);
    }
}
