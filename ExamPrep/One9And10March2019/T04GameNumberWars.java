package M01_ProgrammingBasics.ExamPrep.One9And10March2019;

import java.util.Scanner;

public class T04GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstPlayer = scanner.nextLine();
        String secondPlayer = scanner.nextLine();
        String command = scanner.nextLine();
        int player1Points = 0;
        int player2Points = 0;
        String winner = "";
        int player1Card = 0;
        int player2Card = 0;
        int points = 0;

        while (!command.equals("End of game")) {
            player1Card = Integer.parseInt(command);
            player2Card = Integer.parseInt(scanner.nextLine());

            if (player1Card > player2Card) {
                player1Points = player1Points + player1Card - player2Card;
            } else if (player2Card > player1Card) {
                player2Points = player2Points + player2Card - player1Card;
            } else if (player1Card == player2Card) {
                System.out.println("Number wars!");
                int card1 = Integer.parseInt(scanner.nextLine());
                int card2 = Integer.parseInt(scanner.nextLine());

                if (card1 > card2) {
                    winner = firstPlayer;
                    points = player1Points;
                    break;
                } else if (card2 > card1) {
                    winner = secondPlayer;
                    points = player2Points;
                    break;
                }
            }
            command = scanner.nextLine();
        }
        if (player1Card == player2Card) {
            System.out.printf("%s is winner with %d points", winner, points);
        } else {
            System.out.printf("%s has %d points\n" +
                            "%s has %d points", firstPlayer, player1Points,
                    secondPlayer, player2Points);
        }
    }
}
