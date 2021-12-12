package M01_ProgrammingBasics.ExamPrep.One15And16June2019;

import java.util.Scanner;

public class T04Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roomCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int totalSum = 0;

        while (!input.equals("Movie time!")) {
            int peopleEntering = Integer.parseInt(input);
            roomCapacity -= peopleEntering;
            if (roomCapacity < 0) {
                break;
            }
            if (peopleEntering % 3 == 0) {
                totalSum += (peopleEntering * 5) - 5;
            } else {
                totalSum += peopleEntering * 5;
            }
            input = scanner.nextLine();
        }
        if (roomCapacity > 0 || roomCapacity == 0) {
            System.out.printf("There are %d seats left in the cinema.\n", roomCapacity);
        } else {
            System.out.print("The cinema is full.\n");
        }
        System.out.printf("Cinema income - %d lv.", totalSum);
    }
}