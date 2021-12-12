package M01_ProgrammingBasics.ExamPrep.One15And16June2019;

import java.util.Scanner;

public class T03FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        String packetMovie = scanner.nextLine();
        int numberTickets = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (movieName.equals("John Wick")) {
            if (packetMovie.equals("Drink")) {
                price = 12 * numberTickets;
            } else if (packetMovie.equals("Popcorn")) {
                price = 15 * numberTickets;
            } else if (packetMovie.equals("Menu")) {
                price = 19 * numberTickets;
            }
        } else if (movieName.equals("Star Wars")) {
            if (packetMovie.equals("Drink")) {
                price = 18 * numberTickets;
            } else if (packetMovie.equals("Popcorn")) {
                price = 25 * numberTickets;
            } else if (packetMovie.equals("Menu")) {
                price = 30 * numberTickets;
            }
            if (numberTickets >= 4) {
                price = price - price * 0.30;
            }
        } else if (movieName.equals("Jumanji")) {
            if (packetMovie.equals("Drink")) {
                price = 9 * numberTickets;
            } else if (packetMovie.equals("Popcorn")) {
                price = 11 * numberTickets;
            } else if (packetMovie.equals("Menu")) {
                price = 14 * numberTickets;
            }
            if (numberTickets == 2) {
                price = price - price * 0.15;
            }
        }
        System.out.printf("Your bill is %.2f leva.", price);
    }
}
