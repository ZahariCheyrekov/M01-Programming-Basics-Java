package M01_ProgrammingBasics.L04_ForLoop.Lab;

import java.util.Scanner;

public class T06VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        String text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            switch (symbol) {
                case 'a':
                    sum = sum + 1;
                    break;
                case 'e':
                    sum = sum + 2;
                    break;
                case 'i':
                    sum = sum + 3;
                    break;
                case 'o':
                    sum = sum + 4;
                    break;
                case 'u':
                    sum = sum + 5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
