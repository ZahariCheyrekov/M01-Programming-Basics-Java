package M01_ProgrammingBasics.ExamPrep.One6And7July2019;

import java.util.Scanner;

public class T01PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPeople = Integer.parseInt(scanner.nextLine());
        double taxEntrance = Double.parseDouble(scanner.nextLine());
        double deckChairPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double sumEntrance = numberPeople * taxEntrance;
        double people75 = numberPeople - numberPeople * 0.25;
        double people = Math.ceil(people75);
        double deckChairSum = people * deckChairPrice;
        double umbrellaNum = numberPeople * 0.5;
        double peopleUmbrella = Math.ceil(umbrellaNum);
        double umbrellaSum = peopleUmbrella * umbrellaPrice;
        double totalSum = sumEntrance + deckChairSum + umbrellaSum;

        System.out.printf("%.2f lv.", totalSum);
    }
}
