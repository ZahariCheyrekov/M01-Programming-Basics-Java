package M01_ProgrammingBasics.ExamPrep.Two28And29March2020;

import java.util.Scanner;

public class T01SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        double cleaning = Double.parseDouble(scanner.nextLine());
        double percentDiscount = Double.parseDouble(scanner.nextLine());

        double allPrice = (pens * 5.80) + (markers * 7.20) + (cleaning * 1.20);
        double priceWithDiscount = allPrice - (allPrice * (percentDiscount / 100));

        System.out.printf("%.3f", priceWithDiscount);
    }
}
