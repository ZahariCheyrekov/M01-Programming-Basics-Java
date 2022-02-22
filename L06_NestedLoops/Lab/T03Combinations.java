package M01_ProgrammingBasics.L06_NestedLoops.Lab;

public class T03Combinations {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
             
                int total = i * j;
             
                System.out.printf("%d * %d = %d%n", i, j, total);
            }
        }
    }
}
