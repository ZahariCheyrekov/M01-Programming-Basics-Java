package M01_ProgrammingBasics.L01_FirstStepsInCoding;

import java.util.Scanner;

public class T08PetsShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDogs = Integer.parseInt(scanner.nextLine());
        int otherAnimals = Integer.parseInt(scanner.nextLine());

        double priceForHisDogs = numberOfDogs * 2.50;
        double priceForOtherAnimals = otherAnimals * 4;
        double totalPrice = priceForHisDogs + priceForOtherAnimals;

        System.out.println(totalPrice + " lv.");


    }
}
