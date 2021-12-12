package M01_ProgrammingBasics.ExamPrep.From6And7April2019;

import java.util.Scanner;

public class T03OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        String roomType = scanner.nextLine();
        int boughtTickets = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (roomType.equals("normal")) {
            if (movieName.equals("A Star Is Born")) {
                price = boughtTickets * 7.50;
            } else if (movieName.equals("Bohemian Rhapsody")) {
                price = boughtTickets * 7.35;
            } else if (movieName.equals("Green Book")) {
                price = boughtTickets * 8.15;
            } else if (movieName.equals("The Favourite")) {
                price = boughtTickets * 8.75;
            }
        } else if (roomType.equals("luxury")) {
            if (movieName.equals("A Star Is Born")) {
                price = boughtTickets * 10.50;
            } else if (movieName.equals("Bohemian Rhapsody")) {
                price = boughtTickets * 9.45;
            } else if (movieName.equals("Green Book")) {
                price = boughtTickets * 10.25;
            } else if (movieName.equals("The Favourite")) {
                price = boughtTickets * 11.55;
            }
        } else if (roomType.equals("ultra luxury")) {
            if (movieName.equals("A Star Is Born")) {
                price = boughtTickets * 13.50;
            } else if (movieName.equals("Bohemian Rhapsody")) {
                price = boughtTickets * 12.75;
            } else if (movieName.equals("Green Book")) {
                price = boughtTickets * 13.25;
            } else if (movieName.equals("The Favourite")) {
                price = boughtTickets * 13.95;
            }
        }
        System.out.printf("%s -> %.2f lv.", movieName, price);
    }
}