package M01_ProgrammingBasics.ExamPrep.One9And10March2019;

import java.util.Scanner;

public class T03Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String instrument = scanner.nextLine();
        double difficulty = 0;
        double appearance = 0;
        double sum = 0;
        double maxScore = 20;

        if (country.equals("Russia")) {
            if (instrument.equals("ribbon")) {
                difficulty = 9.100;
                appearance = 9.400;
                sum += difficulty + appearance;
            } else if (instrument.equals("hoop")) {
                difficulty = 9.300;
                appearance = 9.800;
                sum += difficulty + appearance;
            } else if (instrument.equals("rope")) {
                difficulty = 9.600;
                appearance = 9.000;
                sum += difficulty + appearance;
            }
        } else if (country.equals("Bulgaria")) {
            if (instrument.equals("ribbon")) {
                difficulty = 9.600;
                appearance = 9.400;
                sum += difficulty + appearance;
            } else if (instrument.equals("hoop")) {
                difficulty = 9.550;
                appearance = 9.750;
                sum += difficulty + appearance;
            } else if (instrument.equals("rope")) {
                difficulty = 9.500;
                appearance = 9.400;
                sum += difficulty + appearance;
            }
        } else if (country.equals("Italy")) {
            if (instrument.equals("ribbon")) {
                difficulty = 9.200;
                appearance = 9.500;
                sum += difficulty + appearance;
            } else if (instrument.equals("hoop")) {
                difficulty = 9.450;
                appearance = 9.350;
                sum += difficulty + appearance;
            } else if (instrument.equals("rope")) {
                difficulty = 9.700;
                appearance = 9.150;
                sum += difficulty + appearance;
            }
        }
        double diff = maxScore - sum;
        System.out.printf("The team of %s get %.3f on %s.\n", country, sum, instrument);
        System.out.printf("%.2f%%", (diff / maxScore) * 100);

    }
}
