package M01_ProgrammingBasics.L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class T10Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cash1lvNum = Integer.parseInt(scanner.nextLine());
        int cash2lvNum = Integer.parseInt(scanner.nextLine());
        int cash5lvNum = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());
        int oneLv = 1;
        int twoLv = 2;
        int fiveLv = 5;

        for (int i = 0; i <= cash1lvNum; i++) {
            for (int j = 0; j <= cash2lvNum; j++) {
                for (int k = 0; k <= cash5lvNum; k++) {
                    if ((i * oneLv) + (j * twoLv) + (k * fiveLv) == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n", i, j, k, sum);
                    }
                }
            }
        }
    }
}