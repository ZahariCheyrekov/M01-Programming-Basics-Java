package M01_ProgrammingBasics.L05_WhileLoop.Lab;

import java.util.Scanner;

public class T01ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            System.out.println(input);
            input = scanner.nextLine();
        }
    }
}
