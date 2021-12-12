package M01_ProgrammingBasics.L01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class T06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sc = Double.parseDouble(scanner.nextLine());
        double ca = Double.parseDouble(scanner.nextLine());
        double pa = Double.parseDouble(scanner.nextLine());
        double sa = Double.parseDouble(scanner.nextLine());
        double mi = Double.parseDouble(scanner.nextLine());

        double paPrice = sc + sc * 0.60;
        double paSum = pa * paPrice;
        double saPrice = ca + ca * 0.80;
        double saSum = saPrice * sa;
        double miSum = mi * 7.50;
        double totalSum = paSum + saSum + miSum;

        System.out.printf("%.2f", totalSum);
    }

}
