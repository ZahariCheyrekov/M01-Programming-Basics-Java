package M01_ProgrammingBasics.L04_ForLoop.Exercises;

import java.util.Scanner;

public class T06Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        boolean haveSalary = true;

        for (int i = 1; i <= n; i++) {
            String website = scanner.nextLine();

            if (website.equals("Facebook")) {
                salary -= 150;
            } else if (website.equals("Instagram")) {
                salary -= 100;
            } else if (website.equals("Reddit")) {
                salary -= 50;
            }

            if (salary <= 0) {
                haveSalary = false;
                break;
            }
        }
        if(haveSalary){
            System.out.printf("%d", salary);
        }else {
            System.out.println("You have lost your salary.");
        }

    }
}
