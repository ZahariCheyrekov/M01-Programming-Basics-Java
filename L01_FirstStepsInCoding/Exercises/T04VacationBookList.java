package M01_ProgrammingBasics.L01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class T04VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPages = Integer.parseInt(scanner.nextLine());
        int pagesForOneHour = Integer.parseInt(scanner.nextLine());
        int daysToReadBook = Integer.parseInt(scanner.nextLine());

        int timeForBook =  numberOfPages / pagesForOneHour;
        int hoursPerDay = timeForBook / daysToReadBook;

        System.out.println(hoursPerDay);


    }
}
