package M01_ProgrammingBasics.ExamPrep.Two6And7July2019;

import java.util.Scanner;

public class T03TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        String packetType = scanner.nextLine();
        String vipDiscount = scanner.nextLine();
        int daysStaying = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (daysStaying > 7) {
            daysStaying -= 1;
        }
        if (daysStaying < 1) {
            System.out.print("Days must be positive number!");
        } else {
            if (town.equals("Bansko") || town.equals("Borovets")) {
                if (packetType.equals("noEquipment")) {
                    price = daysStaying * 80;
                    if (vipDiscount.equals("yes")) {
                        price = price - price * 0.05;
                    }
                } else if (packetType.equals("withEquipment")) {
                    price = daysStaying * 100;
                    if (vipDiscount.equals("yes")) {
                        price = price - price * 0.10;
                    }
                } else {
                    System.out.print("Invalid input!");
                }
            } else if (town.equals("Varna") || town.equals("Burgas")) {
                if (packetType.equals("noBreakfast")) {
                    price = daysStaying * 100;
                    if (vipDiscount.equals("yes")) {
                        price = price - price * 0.07;
                    }
                } else if (packetType.equals("withBreakfast")) {
                    price = daysStaying * 130;
                    if (vipDiscount.equals("yes")) {
                        price = price - price * 0.12;
                    }
                } else {
                    System.out.print("Invalid input!");
                }
            } else {
                System.out.print("Invalid input!");
            }
        }
        if (town.equals("Bansko") || town.equals("Borovets") ||
                town.equals("Varna") || town.equals("Burgas")) {
            if (daysStaying > 1) {
                if (packetType.equals("noBreakfast") || packetType.equals("withBreakfast") ||
                        packetType.equals("noEquipment") || packetType.equals("withEquipment")) {
                    System.out.printf("The price is %.2flv! Have a nice time!", price);
                }
            }
        }
    }
}