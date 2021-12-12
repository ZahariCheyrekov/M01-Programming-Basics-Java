package M01_ProgrammingBasics.ExamPrep.Two15And16June2019;

import java.util.Scanner;

public class T01MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int numberOfDays = Integer.parseInt(scanner.nextLine());
        int numberOfTickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int cinemaPercent = Integer.parseInt(scanner.nextLine());

        double priceTickets = numberOfTickets * ticketPrice;
        double allDays = priceTickets * numberOfDays;
        double percent = (allDays * cinemaPercent) / 100;
        double moneyFromMovie = allDays - percent;

        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, moneyFromMovie);
    }
}
