package M01_ProgrammingBasics.ExamPrep.Two15And16June2019;

import java.util.Scanner;

public class T05Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int numberJudges = Integer.parseInt(scanner.nextLine());
        double points = 0;

        for (int i = 1; i <= numberJudges; i++) {
            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());
            int length = judgeName.length();
            points = (length * judgePoints) / 2;
            academyPoints += points;
            if (academyPoints >= 1250.5) {
                break;
            }
        }
        double diff = Math.abs(1250.5 - academyPoints);
        if (academyPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee " +
                    "for leading role with %.1f!", actorName, academyPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, diff);
        }
    }
}