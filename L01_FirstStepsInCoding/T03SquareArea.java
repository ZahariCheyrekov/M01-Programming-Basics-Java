package M01_ProgrammingBasics.L01_FirstStepsInCoding;

import java.util.Scanner;

public class T03SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = Integer.parseInt(scanner.nextLine());
        int area = a * a;
        System.out.println(area);
    }
}
