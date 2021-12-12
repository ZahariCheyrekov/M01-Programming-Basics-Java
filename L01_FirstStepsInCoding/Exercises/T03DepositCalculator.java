package M01_ProgrammingBasics.L01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class T03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double annulInterestRate = Double.parseDouble(scanner.nextLine());

        double annualRateDeposit = deposit * annulInterestRate / 100;
        double forOneMonth = annualRateDeposit / 12;
        double totalSum = deposit + months * forOneMonth;

        System.out.println(totalSum);


    }
}
