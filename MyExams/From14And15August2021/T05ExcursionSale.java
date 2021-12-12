package M01_ProgrammingBasics.MyExams.From14And15August2021;

import java.util.Scanner;

public class T05ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberExcursionsSea = Integer.parseInt(scanner.nextLine());
        int numberExcursionsMountain = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double profit = 0;
        boolean hasBeenSold = false;

        while (!input.equals("Stop")) {
            if (input.equals("sea")) {
                if (numberExcursionsSea > 0) {
                    profit += 680;
                    numberExcursionsSea--;
                }
            } else if (input.equals("mountain")) {
                if (numberExcursionsMountain > 0) {
                    profit += 499;
                    numberExcursionsMountain--;
                }
            }
            if (numberExcursionsMountain == 0 && numberExcursionsSea == 0) {
                hasBeenSold = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (hasBeenSold) {
            System.out.print("Good job! Everything is sold.\n");
        }
        System.out.printf("Profit: %.0f leva.", profit);
    }
}