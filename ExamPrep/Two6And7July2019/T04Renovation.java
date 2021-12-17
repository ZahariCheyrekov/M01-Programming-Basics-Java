package M01_ProgrammingBasics.ExamPrep.Two6And7July2019;

import java.util.Scanner;

public class T04Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wallHeight = Integer.parseInt(scanner.nextLine());
        int wallWidth = Integer.parseInt(scanner.nextLine());
        int percentNoPainting = Integer.parseInt(scanner.nextLine());

        int allWallsSum = wallHeight * wallWidth * 4;
        double finalSum = allWallsSum - allWallsSum * (percentNoPainting * 0.01);
        double finalSumCeil = Math.ceil(finalSum);
        String input = scanner.nextLine();

        while (!input.equals("Tired!")) {
            int litersPaint = Integer.parseInt(input);
            finalSumCeil -= litersPaint;
            if (finalSumCeil <= 0) {
                break;
            }
            input = scanner.nextLine();
        }
        double abs = Math.abs(finalSumCeil);
        if (input.equals("Tired!")) {
            System.out.printf("%.0f quadratic m left.", finalSumCeil);
        } else if (finalSumCeil < 0) {
            System.out.printf("All walls are painted and you have %.0f l paint left!", abs);
        } else if (finalSumCeil == 0) {
            System.out.print("All walls are painted! Great job, Pesho!");
        }
    }
}