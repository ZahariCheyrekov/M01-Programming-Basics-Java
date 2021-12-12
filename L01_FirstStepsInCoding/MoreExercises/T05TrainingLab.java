package M01_ProgrammingBasics.L01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class T05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double hToCm = h * 100 - 100;
        double wToCm = w * 100;

        double numToRow = Math.floor(wToCm / 120);
        double numRows = Math.floor(hToCm / 70);
        double allDesks = numRows * numToRow - 3;


        System.out.printf("%.2f", allDesks);
    }
}
