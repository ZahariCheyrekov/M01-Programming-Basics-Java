package M01_ProgrammingBasics.ExamPrep.From18And19July2020;

import java.util.Scanner;

public class T01AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfCompany = scanner.nextLine();
        int adultTicketAmount = Integer.parseInt(scanner.nextLine());
        int childTicketsAmount = Integer.parseInt(scanner.nextLine());
        double adultTicketPrice = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        double childTicketPrice = adultTicketPrice - (adultTicketPrice * 0.70);
        double adultTicketPriceTax = adultTicketPrice + tax;
        double childTicketPriceTax = childTicketPrice + tax;
        double totalPrice = (childTicketsAmount * childTicketPriceTax) + (adultTicketAmount * adultTicketPriceTax);
        double profitAfterTax = totalPrice * 0.20;

        System.out.printf("The profit of your agency from " + nameOfCompany + " tickets is %.2f lv.", profitAfterTax);
    }
}