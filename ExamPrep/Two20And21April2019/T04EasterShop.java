package M01_ProgrammingBasics.ExamPrep.Two20And21April2019;

import java.util.Scanner;

public class T04EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eggsAmountInTheShop = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int eggsSold = 0;
        int eggsBuy = 0;
        int eggsFill = 0;

        while (!input.equals("Close")) {
            if (input.equals("Fill")) {
                eggsFill = Integer.parseInt(scanner.nextLine());
                eggsAmountInTheShop += eggsFill;
            } else if (input.equals("Buy")) {
                eggsBuy = Integer.parseInt(scanner.nextLine());
                if (eggsAmountInTheShop < eggsBuy) {
                    System.out.println("Not enough eggs in store!");
                    System.out.printf("You can buy only %d.", eggsAmountInTheShop);
                    break;
                }
                eggsSold += eggsBuy;
                eggsAmountInTheShop -= eggsBuy;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Close")) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", eggsSold);
        }
    }
}

