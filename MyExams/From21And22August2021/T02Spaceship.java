package M01_ProgrammingBasics.MyExams.From21And22August2021;

import java.util.Scanner;

public class T02Spaceship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double averageHeightAstronauts = Double.parseDouble(scanner.nextLine());

        double rocketVolume = width * length * height;
        double volumeRoom = (averageHeightAstronauts + 0.40) * 2 * 2;
        double spaceFree = Math.floor(rocketVolume / volumeRoom);

        if (spaceFree >= 3 && spaceFree < 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", spaceFree);
        } else if (spaceFree < 3) {
            System.out.print("The spacecraft is too small.");
        } else if (spaceFree >= 10) {
            System.out.print("The spacecraft is too big.");
        }
    }
}