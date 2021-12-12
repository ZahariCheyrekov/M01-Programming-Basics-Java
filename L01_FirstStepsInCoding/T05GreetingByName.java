package M01_ProgrammingBasics.L01_FirstStepsInCoding;

import java.util.Scanner;

public class T05GreetingByName {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");
        }
    }
