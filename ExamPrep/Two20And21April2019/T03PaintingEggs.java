package M01_ProgrammingBasics.ExamPrep.Two20And21April2019;

import java.util.Scanner;

public class T03PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String eggsSize = scanner.nextLine();
        String eggsColor = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (eggsSize.equals("Large")) {
            if (eggsColor.equals("Red")) {
                price = amount * 16;
            } else if (eggsColor.equals("Green")) {
                price = amount * 12;
            } else if (eggsColor.equals("Yellow")) {
                price = amount * 9;
            }
        } else if (eggsSize.equals("Medium")) {
            if (eggsColor.equals("Red")) {
                price = amount * 13;
            } else if (eggsColor.equals("Green")) {
                price = amount * 9;
            } else if (eggsColor.equals("Yellow")) {
                price = amount * 7;
            }
        } else if (eggsSize.equals("Small")) {
            if (eggsColor.equals("Red")) {
                price = amount * 9;
            } else if (eggsColor.equals("Green")) {
                price = amount * 8;
            } else if (eggsColor.equals("Yellow")) {
                price = amount * 5;
            }
        }
        double tax = price - price * 0.35;
        System.out.printf("%.2f leva.", tax);
    }
}
