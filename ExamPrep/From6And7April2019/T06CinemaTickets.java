package M01_ProgrammingBasics.ExamPrep.From6And7April2019;

import java.util.Scanner;

public class T06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String film = scanner.nextLine();
        int student = 0;
        int standard = 0;
        int kid = 0;
        int soldTickets = 0;
        int soldTicketsMovie = 0;

        while (!film.equals("Finish")) {
            int freePlaces = Integer.parseInt(scanner.nextLine());
            soldTicketsMovie = 0;
            for (int freeSpace = 1; freeSpace <= freePlaces; freeSpace++) {
                String ticketType = scanner.nextLine();
                if (ticketType.equals("End")) {
                    break;
                } else if (ticketType.equals("student")) {
                    student++;
                    soldTickets++;
                    soldTicketsMovie++;
                } else if (ticketType.equals("standard")) {
                    standard++;
                    soldTickets++;
                    soldTicketsMovie++;
                } else if (ticketType.equals("kid")) {
                    kid++;
                    soldTickets++;
                    soldTicketsMovie++;
                }
            }
            System.out.printf("%s - %.2f%% full.\n", film, 1.0 * soldTicketsMovie / freePlaces * 100);
            film = scanner.nextLine();
        }
        double studentPercent = 1.0 * student / soldTickets * 100;
        double standardPercent = 1.0 * standard / soldTickets * 100;
        double kidPercent = 1.0 * kid / soldTickets * 100;

        System.out.printf("Total tickets: %d\n" +
                "%.2f%% student tickets.\n" +
                "%.2f%% standard tickets.\n" +
                "%.2f%% kids tickets.", soldTickets, studentPercent, standardPercent, kidPercent);
    }
}