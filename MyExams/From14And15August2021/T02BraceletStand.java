package M01_ProgrammingBasics.MyExams.From14And15August2021;

import java.util.Scanner;

public class T02BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pocketMoney = Double.parseDouble(scanner.nextLine());
        double winningMoneyFromSales = Double.parseDouble(scanner.nextLine());
        double expenses = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double savedMoney = 5 * pocketMoney;
        double winedMoney = 5 * winningMoneyFromSales;
        double totalSavedMoney = savedMoney + winedMoney;
        double minusExpenses = totalSavedMoney - expenses;

        if (minusExpenses >= giftPrice) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", minusExpenses);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", giftPrice - minusExpenses);
        }
    }
}