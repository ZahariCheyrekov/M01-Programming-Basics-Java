package M01_ProgrammingBasics.ExamPrep.From18And19July2020;

import java.util.Scanner;

public class T06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());

        //for start num
        int finalNum1 = startNum % 10;
        startNum = startNum / 10;
        int thirdNum1 = startNum % 10;
        startNum = startNum / 10;
        int secondNum1 = startNum % 10;
        startNum = startNum / 10;
        int firstNum1 = startNum % 10;

        //for end num
        int finalNum2 = endNum % 10;
        endNum = endNum / 10;
        int thirdNum2 = endNum % 10;
        endNum = endNum / 10;
        int secondNum2 = endNum % 10;
        endNum = endNum / 10;
        int firstNum2 = endNum % 10;

        //generator
        for (int one = firstNum1; one <= firstNum2; one++) {
            for (int two = secondNum1; two <= secondNum2; two++) {
                for (int tree = thirdNum1; tree <= thirdNum2; tree++) {
                    for (int four = finalNum1; four <= finalNum2; four++) {
                        if (one % 2 == 1 && two % 2 == 1 && tree % 2 == 1 && four % 2 == 1) {
                            System.out.printf("%d%d%d%d ", one, two, tree, four);
                        }
                    }
                }
            }
        }
    }
}