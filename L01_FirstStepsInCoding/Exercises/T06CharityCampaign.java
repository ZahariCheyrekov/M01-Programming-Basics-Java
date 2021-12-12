package M01_ProgrammingBasics.L01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class T06CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOfCampaign = Integer.parseInt(scanner.nextLine());
        int bakers = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double priceForCakes = cakes * 45;
        double wafflesPrice = waffles * 5.80;
        double pancakesPrice = pancakes * 3.20;

        double forAllBakers = (priceForCakes + wafflesPrice + pancakesPrice) * bakers;
        double total = forAllBakers * daysOfCampaign;
        double afterTax = total - (total / 8);
        System.out.printf("%.2f", afterTax);
    }
}
