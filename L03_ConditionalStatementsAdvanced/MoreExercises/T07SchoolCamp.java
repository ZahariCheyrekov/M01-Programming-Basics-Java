package M01_ProgrammingBasics.L03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class T07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int numberStudents = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        String sport = "";
        double price = 0;

        switch (season) {
            case "Winter":
                if ((group.equals("boys")) || group.equals("girls")) {
                    price = numberStudents * nights * 9.60;
                    if (group.equals("boys")) {
                        sport = "Judo";
                    }
                    if (group.equals("girls")) {
                        sport = "Gymnastics";
                    }
                } else if (group.equals("mixed")) {
                    sport = "Ski";
                    price = nights * numberStudents * 10;
                }
                break;
            case "Spring":
                if ((group.equals("boys")) || group.equals("girls")) {
                    price = numberStudents * nights * 7.20;
                    if (group.equals("boys")) {
                        sport = "Tennis";
                    }
                    if (group.equals("girls")) {
                        sport = "Athletics";
                    }
                } else if (group.equals("mixed")) {
                    sport = "Cycling";
                    price = nights * numberStudents * 9.50;
                }
                break;
            case "Summer":
                if ((group.equals("boys")) || group.equals("girls")) {
                    price = numberStudents * nights * 15;
                    if (group.equals("boys")) {
                        sport = "Football";
                    }
                    if (group.equals("girls")) {
                        sport = "Volleyball";
                    }
                } else if (group.equals("mixed")) {
                    sport = "Swimming";
                    price = numberStudents * nights * 20;
                }
                break;
        }
        if (numberStudents >= 50) {
            price = price - price * 0.50;
        } else if (numberStudents >= 20) {
            price = price - price * 0.15;
        } else if (numberStudents >= 10) {
            price = price - price * 0.05;
        }
        System.out.printf("%s %.2f lv.", sport, price);
    }
}

