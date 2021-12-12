package M01_ProgrammingBasics.MyExams.From14And15August2021;

import java.util.Scanner;

public class T01ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paperAmount = Integer.parseInt(scanner.nextLine());
        int cloth = Integer.parseInt(scanner.nextLine());
        double litersGlue = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double pricePaper = paperAmount * 5.80;
        double clothPrice = cloth * 7.20;
        double gluePrice = litersGlue * 1.20;
        double total = pricePaper + clothPrice + gluePrice;
        double sumDiscount = total - (total * (percentDiscount * 0.01));

        System.out.printf("%.3f", sumDiscount);
    }
}