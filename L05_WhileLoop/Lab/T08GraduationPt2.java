package M01_ProgrammingBasics.L05_WhileLoop.Lab;

import java.util.Scanner;

public class T08GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int grade = 1;
        int excluded = 0;
        double sumGrades = 0;

        while (grade <= 12) {
            double grades = Double.parseDouble(scanner.nextLine());
            if (grades >= 4.00) {
                sumGrades += grades;
                grade++;
            }
            if (grades < 4) {
                excluded++;
                if (excluded > 1) {
                    System.out.printf("%s has been excluded at %d grade", name, grade);
                    break;
                }
            }
        }
        double averageGrade = sumGrades / 12;

        if (excluded < 2) {
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }
    }
}