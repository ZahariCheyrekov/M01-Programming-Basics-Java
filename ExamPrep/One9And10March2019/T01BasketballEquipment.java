package M01_ProgrammingBasics.ExamPrep.One9And10March2019;

import java.util.Scanner;

public class T01BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearlyPayment = Integer.parseInt(scanner.nextLine());
        double shoes = yearlyPayment - yearlyPayment * 0.40;
        double basketballJersey = shoes - shoes * 0.20;
        double ball = basketballJersey / 4;
        double accessories = ball / 5;
        double totalPrice = yearlyPayment + shoes + basketballJersey + ball + accessories;

        System.out.printf("%.2f", totalPrice);
    }
}
