package M01_ProgrammingBasics.L05_WhileLoop.Exercises;

import java.util.Scanner;

public class T02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badGrades = Integer.parseInt(scanner.nextLine());
        int badGradesCounter = 0;
        boolean needBreak = false;
        int problemsSolved = 0;
        String lastProblem = "";
        int gradeSum = 0;

        String input = scanner.nextLine();
        while (!input.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4.00) {
                problemsSolved++;
                gradeSum += grade;
                badGradesCounter++;
                if (badGradesCounter == badGrades) {
                    needBreak = true;
                    break;
                }
            } else {
                gradeSum += grade;
                problemsSolved++;
                lastProblem = input;
            }
            input = scanner.nextLine();
        }
        if (needBreak) {
            System.out.printf("You need a break, %d poor grades.", badGradesCounter);
        } else {
            System.out.printf("Average score: %.2f\n", 1.0 * gradeSum / problemsSolved);
            System.out.printf("Number of problems: %d\n", problemsSolved);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}