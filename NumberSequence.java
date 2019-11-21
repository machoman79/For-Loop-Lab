import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCounts = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int c = 1; c <= numCounts; c++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > maxNumber) {
                maxNumber = num;
            }
            if (num < minNumber) {
                minNumber = num;
            }
        }
        System.out.println("Max number: " + maxNumber);
        System.out.println("Min number: " + minNumber);
    }
}
