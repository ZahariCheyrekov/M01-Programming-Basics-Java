package M01_ProgrammingBasics.L04_ForLoop.MoreExercises;

import java.util.Scanner;

public class T04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int topStudents = 0;
        int between5and4 = 0;
        int between4and3 = 0;
        int fail = 0;
        double total = 0;

        for (int i = 1; i <= numberOfStudents; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 5) {
                topStudents++;
                total += grade;
            } else if (grade >= 4) {
                between5and4++;
                total += grade;
            } else if (grade >= 3) {
                between4and3++;
                total += grade;
            } else if (grade < 3) {
                fail++;
                total += grade;
            }
        }
        double topStudentsPercent = 1.0 * topStudents / numberOfStudents * 100;
        double between5and4Percent = 1.0 * between5and4 / numberOfStudents * 100;
        double between4and3Percent = 1.0 * between4and3 / numberOfStudents * 100;
        double failPercent = 1.0 * fail / numberOfStudents * 100;
        double average = total / numberOfStudents;

        System.out.printf("Top students: %.2f%%%n", topStudentsPercent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", between5and4Percent);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", between4and3Percent);
        System.out.printf("Fail: %.2f%%%n", failPercent);
        System.out.printf("Average: %.2f%n", average);
    }
}