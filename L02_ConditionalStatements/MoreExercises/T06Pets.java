package M01_ProgrammingBasics.L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class T06Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOgfDays = Integer.parseInt(scanner.nextLine());
        int foodInKilograms = Integer.parseInt(scanner.nextLine());
        double foodForDogPerDay = Double.parseDouble(scanner.nextLine());
        double foodForCatPerDay = Double.parseDouble(scanner.nextLine());
        double foodForTurtlePerDay = Double.parseDouble(scanner.nextLine());

        double foodDog = numberOgfDays * foodForDogPerDay;
        double foodCat = numberOgfDays * foodForCatPerDay;
        double foodTurtle = numberOgfDays * foodForTurtlePerDay / 1000;
        double totalFood = foodDog + foodCat + foodTurtle;
        double difference = Math.abs(totalFood - foodInKilograms);


        if (totalFood <= foodInKilograms) {
            double foodLeft = Math.floor(difference);
            System.out.printf("%.0f kilos of food left.", foodLeft);
        } else {
            double foodNeeded = Math.ceil(difference);
            System.out.printf("%.0f more kilos of food are needed.", foodNeeded);
        }
    }
}
