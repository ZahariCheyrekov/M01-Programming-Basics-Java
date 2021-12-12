package M01_ProgrammingBasics.MyExams.From21And22August2021;

import java.util.Scanner;

public class T01ProgrammingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOnePage = Double.parseDouble(scanner.nextLine());
        double priceOneCover = Double.parseDouble(scanner.nextLine());
        int discountForPaper = Integer.parseInt(scanner.nextLine());
        double sumForDesigner = Double.parseDouble(scanner.nextLine());
        int percentPaid = Integer.parseInt(scanner.nextLine());

        double startSum = priceOnePage * 899 + priceOneCover * 2;
        double discount = startSum - (startSum * (0.01 * discountForPaper));
        double withDesigner = discount + sumForDesigner;
        double finalSum = withDesigner - (withDesigner * (percentPaid * 0.01));

        System.out.printf("Avtonom should pay %.2f BGN.", finalSum);
    }
}