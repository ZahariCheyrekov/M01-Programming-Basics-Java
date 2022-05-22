package M01_ProgrammingBasics.L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class T07FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
	int mon = Integer.parseInt(scanner.nextLine());
        int zum = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double priceGift = Double.parseDouble(scanner.nextLine());

        double totalSum = mon * 3.25 + zum * 4 + roses * 3.50 + cactus * 8;
        double tax = totalSum / 100 * 5;
        double profit = totalSum - tax;
        double difference = Math.abs(priceGift - profit);

        if (profit < priceGift) {
            double borrowMoney = Math.ceil(difference);
            System.out.printf("She will have to borrow %.0f leva.", borrowMoney);
        } else {
            double levaLeft = Math.floor(difference);
            System.out.printf("She is left with %.0f leva.", levaLeft);
        }
    }
}
