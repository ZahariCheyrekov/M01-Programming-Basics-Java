package M01_ProgrammingBasics.ExamPrep.Two20And21April2019;

import java.util.Scanner;

public class T01EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double flourKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int maq = Integer.parseInt(scanner.nextLine());

        double sugarPrice = flourPrice * 0.75;
        double eggsPrice = flourPrice * 1.1;
        double maqPrice = sugarPrice * 0.20;
        double flourSum = flourKg * flourPrice;
        double sugarSum = sugarKg * sugarPrice;
        double eggsSum = eggs * eggsPrice;
        double maqSum = maq * maqPrice;

        double total = flourSum + sugarSum + eggsSum + maqSum;

        System.out.printf("%.2f", total);
    }
}
