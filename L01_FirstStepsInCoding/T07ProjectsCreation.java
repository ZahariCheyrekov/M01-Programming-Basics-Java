package M01_ProgrammingBasics.L01_FirstStepsInCoding;

import java.util.Scanner;

public class T07ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projectsNumber = Integer.parseInt(scanner.nextLine());
        int timeForProjects = projectsNumber * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.",
                name, timeForProjects, projectsNumber);


    }
}
