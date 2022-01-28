package M01_ProgrammingBasics.ExamPrep.Two28And29March2020;

import java.util.Scanner;

public class T05SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacity = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int suitcases = 0;

        while (!input.equals("End")) {
            double suitcasesVolume = Double.parseDouble(input);
            if ((suitcases + 1) % 3 == 0) {
                suitcasesVolume *= 1.10;
            }
            if (capacity < suitcasesVolume) {
                break;
            }
            suitcases++;
            capacity -= suitcasesVolume;
            input = scanner.nextLine();
        }
        if (input.equals("End")) {
            System.out.print("Congratulations! All suitcases are loaded!\n");
        } else {
            System.out.print("No more space!\n");
        }
        System.out.printf("Statistic: %d suitcases loaded.", suitcases);
    }
}