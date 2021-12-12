package M01_ProgrammingBasics.L01_FirstStepsInCoding;

import java.util.Scanner;

public class T09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters = Double.parseDouble(scanner.nextLine());

        double priceForOneMiter = meters * 7.61;
        double discount = priceForOneMiter * 0.18;
        double finalPrice = priceForOneMiter - discount;

        System.out.printf("The final price is: %.2f lv.", finalPrice);
        System.out.printf("\nThe discount is: %.2f lv. ", discount);


    }
}
