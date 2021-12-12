package M01_ProgrammingBasics.L05_WhileLoop.Exercises;

import java.util.Scanner;

public class T01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
        int counter = 0;
        boolean isFound = false;
        String input = scanner.nextLine();

        while (!input.equals("No More Books")) {
            if (input.equals(bookName)) {
                isFound = true;
                break;
            }
            counter++;
            input = scanner.nextLine();
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.", counter);
        } else {
            System.out.printf("The book you search is not here!\n" +
                    "You checked %d books.", counter);
        }
    }
}
