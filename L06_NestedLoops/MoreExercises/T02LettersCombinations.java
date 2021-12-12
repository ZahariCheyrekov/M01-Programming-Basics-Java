package M01_ProgrammingBasics.L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class T02LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char startLetter = scanner.nextLine().charAt(0);
        char endLetter = scanner.nextLine().charAt(0);
        char skipLetter = scanner.nextLine().charAt(0);
        int combinationsFound = 0;
        char[] combinationArray = new char[4];
        combinationArray[3] = ' ';

        for (char i = startLetter; i <= endLetter; i++) {
            if (i != skipLetter) {
                combinationArray[0] = i;
                for (char j = startLetter; j <= endLetter; j++) {
                    if (j != skipLetter) {
                        combinationArray[1] = j;
                        for (char k = startLetter; k <= endLetter; k++) {
                            if (k != skipLetter) {
                                combinationArray[2] = k;
                                System.out.print(combinationArray);
                                combinationsFound++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(combinationsFound);
    }
}
