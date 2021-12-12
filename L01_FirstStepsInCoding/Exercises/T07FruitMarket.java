package M01_ProgrammingBasics.L01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class T07FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananasInKilograms = Double.parseDouble(scanner.nextLine());
        double orangesInKilograms = Double.parseDouble(scanner.nextLine());
        double raspberryInKilograms = Double.parseDouble(scanner.nextLine());
        double strawberryInKilograms = Double.parseDouble(scanner.nextLine());

        double raspberryPrice = strawberryPrice / 2;
        double orangesPrice = raspberryPrice - (raspberryPrice * 0.4);
        double bananasPrice = raspberryPrice - (raspberryPrice * 0.8);
        double raspberrySum = raspberryPrice * raspberryInKilograms;
        double bananasSum = bananasInKilograms * bananasPrice;
        double orangesSum = orangesInKilograms * orangesPrice;
        double strawberrySum = strawberryInKilograms * strawberryPrice;
        double total = raspberrySum + bananasSum + orangesSum + strawberrySum;

        System.out.printf("%.2f", total);

    }
}
