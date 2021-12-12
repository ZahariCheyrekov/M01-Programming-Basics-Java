package M01_ProgrammingBasics.L06_NestedLoops.Lab;

import java.util.Scanner;

public class T07CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTickets = 0;
        int studentsTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;

        String movie;
        while (!"Finish".equals(movie = scanner.nextLine())) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int movieTickets = 0;

            String type;
            while (movieTickets < freeSeats && !"End".equals(type = scanner.nextLine())) {
                if (type.equals("student")) {
                    studentsTickets++;
                    totalTickets++;
                    movieTickets++;
                } else if (type.equals("standard")) {
                    standardTickets++;
                    totalTickets++;
                    movieTickets++;
                } else if (type.equals("kid")) {
                    kidTickets++;
                    totalTickets++;
                    movieTickets++;
                }
            }
            System.out.printf("%s - %.2f%% full.%n", movie, movieTickets * 100.0 / freeSeats);
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentsTickets * 100.0 / totalTickets);
        System.out.printf("%.2f%% standard tickets.%n", standardTickets * 100.0 / totalTickets);
        System.out.printf("%.2f%% kids tickets.", kidTickets * 100.0 / totalTickets);
    }
}
