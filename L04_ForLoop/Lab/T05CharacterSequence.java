package M01_ProgrammingBasics.L04_ForLoop.Lab;

import java.util.Scanner;

public class T05CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
       
	for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            System.out.println(letter);
        }
    }
}
