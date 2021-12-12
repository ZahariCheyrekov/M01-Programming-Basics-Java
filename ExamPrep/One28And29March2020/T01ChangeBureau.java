package M01_ProgrammingBasics.ExamPrep.One28And29March2020;

import java.util.Scanner;

public class T01ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfBitcoins = Integer.parseInt(scanner.nextLine());
        double chineseJoan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double priceInBitcoin = numberOfBitcoins * 1168;
        double priceOfJoan = chineseJoan * 0.15;
        double dollarInLv = priceOfJoan * 1.76;
        double bitcoinAndJoanInLv = priceInBitcoin + dollarInLv;
        double moneyInEuro = bitcoinAndJoanInLv / 1.95;
        commission = moneyInEuro - (moneyInEuro / 100) * commission;

        System.out.printf("%.2f", commission);
    }
}
