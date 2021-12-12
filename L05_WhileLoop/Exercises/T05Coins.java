package M01_ProgrammingBasics.L05_WhileLoop.Exercises;

import java.util.Scanner;

public class T05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double coins = Double.parseDouble(scanner.nextLine());
        double reset = coins * 100.0000;

        int numberOfCoins = 0;

        while (reset >= 200) {
            reset -= 200;
            numberOfCoins++;
        }
        while (reset >= 100) {
            reset -= 100;
            numberOfCoins++;
        }
        while (reset >= 50) {
            reset -= 50;
            numberOfCoins++;
        }
        while (reset >= 20) {
            reset -= 20;
            numberOfCoins++;
        }
        while (reset >= 10) {
            reset -= 10;
            numberOfCoins++;
        }
        while (reset >= 5) {
            reset -= 5;
            numberOfCoins++;
        }
        while (reset >= 2) {
            reset -= 2;
            numberOfCoins++;
        }
        while (reset >= 1) {
            reset -= 1;
            numberOfCoins++;
        }
        System.out.println(numberOfCoins);
    }
}
