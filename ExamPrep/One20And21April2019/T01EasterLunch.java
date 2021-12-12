package M01_ProgrammingBasics.ExamPrep.One20And21April2019;

import java.util.Scanner;

public class T01EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int easterBreads = Integer.parseInt(scanner.nextLine());
        int eggsBaskets = Integer.parseInt(scanner.nextLine());
        int kilogramCookies = Integer.parseInt(scanner.nextLine());

        double easterBreadsPrice = easterBreads * 3.20;
        double eggsPrice = eggsBaskets * 4.35;
        double cookiesPrice = kilogramCookies * 5.40;
        double eggsPaint = eggsBaskets * 12 * 0.15;
        double totalPrice = easterBreadsPrice + eggsPrice + cookiesPrice + eggsPaint;

        System.out.printf("%.2f", totalPrice);
    }
}
