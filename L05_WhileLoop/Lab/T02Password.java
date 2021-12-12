package M01_ProgrammingBasics.L05_WhileLoop.Lab;

import java.util.Scanner;

public class T02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String password = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals(password)) {
            input = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", name);
    }
}
