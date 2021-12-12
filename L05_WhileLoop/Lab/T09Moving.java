package M01_ProgrammingBasics.L05_WhileLoop.Lab;

import java.util.Scanner;

public class T09Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int freeSpace = width * length * height;
        int boxesSpace = 0;

        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);
            boxesSpace += boxes;
            if (freeSpace < boxesSpace) {
                break;
            }
            input = scanner.nextLine();
        }
        int diff = Math.abs(freeSpace - boxesSpace);

        if (input.equals("Done") && freeSpace > boxesSpace) {
            System.out.printf("%d Cubic meters left.", diff);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", diff);
        }
    }
}
