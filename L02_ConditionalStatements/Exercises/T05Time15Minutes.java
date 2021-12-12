package M01_ProgrammingBasics.L02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class T05Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int afterTime = minutes + 15;

        if (afterTime >= 60) {
            hours = hours + 1;
            afterTime = afterTime - 60;
            if (hours >= 24) {
                hours = 0;
            }
            if (afterTime <= 9) {
                System.out.println(hours + ":" + "0" + afterTime);
            } else {
                System.out.println(hours + ":" + afterTime);
            }
        } else {
            System.out.println(hours + ":" + afterTime);
        }
    }
}
