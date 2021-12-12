package M01_ProgrammingBasics.L05_WhileLoop.Exercises;

import java.util.Scanner;

public class T04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int stepsGoal = 10000;
        int stepsCounter = 0;


        while (!input.equals("Going home")) {
            int doneSteps = Integer.parseInt(input);
            stepsCounter += doneSteps;

            if (stepsCounter >= stepsGoal) {
                System.out.printf("Goal reached! Good job!%n%d steps over the goal!", stepsCounter - stepsGoal);
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Going home")) {
            int steps = Integer.parseInt(scanner.nextLine());
            stepsCounter += steps;
            if (stepsCounter >= stepsGoal) {
                System.out.printf("Goal reached! Good job!%n%d steps over the goal!", stepsCounter - stepsGoal);
            }
        }
        if (stepsCounter <= stepsGoal) {
            System.out.printf("%d more steps to reach goal.", Math.abs(stepsCounter - stepsGoal));
        }

    }
}
