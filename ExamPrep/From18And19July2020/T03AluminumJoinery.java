package M01_ProgrammingBasics.ExamPrep.From18And19July2020;

import java.util.Scanner;

public class T03AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int joinery = Integer.parseInt(scanner.nextLine());
        String typeJoinery = scanner.nextLine();
        String delivery = scanner.nextLine();
        double price = 0;

        if (joinery < 10) {
            System.out.print("Invalid order");
        } else if (typeJoinery.equals("90X130")) {
            price = joinery * 110;
            if (joinery > 30 && joinery <= 60) {
                price = price * 0.95;
            } else if (joinery > 60) {
                price = price * 0.92;
            }
        } else if (typeJoinery.equals("100X150")) {
            price = joinery * 140;
            if (joinery > 40 && joinery <= 80) {
                price = price * 0.94;
            } else if (joinery > 80) {
                price = price * 0.90;
            }
        } else if (typeJoinery.equals("130X180")) {
            price = joinery * 190;
            if (joinery > 20 && joinery <= 50) {
                price = price * 0.93;
            } else if (joinery > 50) {
                price = price * 0.88;
            }
        } else if (typeJoinery.equals("200X300")) {
            price = joinery * 250;
            if (joinery > 25 && joinery <= 50) {
                price = price * 0.91;
            } else if (joinery > 50) {
                price = price * 0.86;
            }
        }
        if (delivery.equals("With delivery")) {
            price += 60;
        }
        if (joinery > 99) {
            price = price - price * 0.04;
        }
        if (joinery >= 10) {
            System.out.printf("%.2f BGN", price);
        }
    }
}