package M01_ProgrammingBasics.L06_NestedLoops.Exercises;

import java.util.Scanner;

public class T04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String namePresentation = scanner.nextLine();
        double finalSum = 0;
        int numberOfGrades = 0;

        while (!namePresentation.equals("Finish")) {
            double gradeSum = 0;
            String taskName = "";
            for (int competitors = 1; competitors <= people; competitors++) {
                double grade = Double.parseDouble(scanner.nextLine());
                numberOfGrades++;
                gradeSum += grade;
                taskName = namePresentation;
            }
            finalSum += gradeSum;
            System.out.printf("%s - %.2f.\n", taskName, gradeSum / people);

            namePresentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", finalSum / numberOfGrades);
    }
}