package M01_ProgrammingBasics.L04_ForLoop.MoreExercises;

import java.util.Scanner;

public class T02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int period = Integer.parseInt(scanner.nextLine());
        int doctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int i = 1; i <= period; i++) {
            int numPatients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                if (treatedPatients < untreatedPatients) {
                    doctors++;
                }
            }

            if (numPatients <= doctors) {
                treatedPatients += numPatients;
            } else {
                treatedPatients = treatedPatients + doctors;
                untreatedPatients = untreatedPatients + (numPatients - doctors);

            }
        }
        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);
    }
}
