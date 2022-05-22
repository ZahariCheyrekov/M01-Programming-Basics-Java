package M01_ProgrammingBasics.L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class T04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfKilometers = Integer.parseInt(scanner.nextLine());
        String dayNight = scanner.nextLine();

        double taxiPriceStart = 0.70;
        double taxiDay = 0.79;
        double taxiNight = 0.90;
        double busTax = 0.09;
        double trainTax = 0.06;
        
	double totalTaxiDay = taxiPriceStart + taxiDay * numberOfKilometers;
        double totalTaxiNight = taxiPriceStart + taxiNight * numberOfKilometers;
        double totalBusPrice = numberOfKilometers * busTax;
        double totalTrainTax = numberOfKilometers * trainTax;

        if (numberOfKilometers < 20 && dayNight.equalsIgnoreCase("day")) {
            System.out.printf("%.2f", totalTaxiDay);
        } else if (numberOfKilometers < 20 && dayNight.equalsIgnoreCase("night")) {
            System.out.printf("%.2f", totalTaxiNight);
        } else if (numberOfKilometers >= 20 && numberOfKilometers < 100) {
            System.out.printf("%.2f", totalBusPrice);
        } else if (numberOfKilometers >= 100) {
            System.out.printf("%.2f", totalTrainTax);
        }
    }
}
