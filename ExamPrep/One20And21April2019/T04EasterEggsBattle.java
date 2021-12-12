package M01_ProgrammingBasics.ExamPrep.One20And21April2019;

import java.util.Scanner;

public class T04EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstPlayerEggs = Integer.parseInt(scanner.nextLine());
        int secondPlayerEggs = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("End of battle")) {
            if (input.equals("one")) {
                secondPlayerEggs -= 1;
                if (secondPlayerEggs == 0) {
                    System.out.printf("Player two is out of eggs. Player one has %d eggs left.", firstPlayerEggs);
                    break;
                }
            } else if (input.equals("two")) {
                firstPlayerEggs -= 1;
                if (firstPlayerEggs == 0) {
                    System.out.printf("Player one is out of eggs. Player two has %d eggs left.", secondPlayerEggs);
                    break;
                }
            }
            input = scanner.nextLine();
        }
        if (input.equals("End of battle")) {
            System.out.printf("Player one has %d eggs left.\n" +
                    "Player two has %d eggs left.", firstPlayerEggs, secondPlayerEggs);
        }
    }
}
