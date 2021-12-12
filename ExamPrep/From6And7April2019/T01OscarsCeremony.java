package M01_ProgrammingBasics.ExamPrep.From6And7April2019;

import java.util.Scanner;

public class T01OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roomTax = Integer.parseInt(scanner.nextLine());
        double awards = roomTax - roomTax * 0.30;
        double food = awards - awards * 0.15;
        double sound = food / 2;
        double totalSum = roomTax + awards + food + sound;

        System.out.printf("%.2f", totalSum);
    }
}
