package M01_ProgrammingBasics.ExamPrep.From6And7April2019;

import java.util.Scanner;

public class T04CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voucherAmount = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int boughtTickets = 0;
        int others = 0;

        while (!input.equals("End")) {
            int length = input.length();
            if (length > 8) {
                int ascii1 = input.charAt(0);
                int ascii2 = input.charAt(1);
                int sum = ascii1 + ascii2;
                if (sum > voucherAmount) {
                    break;
                }
                voucherAmount -= sum;
                boughtTickets++;
            } else {
                int ascii = input.charAt(0);
                if (ascii > voucherAmount) {
                    break;
                }
                others++;
                voucherAmount -= ascii;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%d\n%d", boughtTickets, others);
    }
}