import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double evenSum = 0.0;
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;

        double oddSum = 0.0;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;

        if (n != 0) {
            for (int index = 1; index <= n; index++) {
                double num = Double.parseDouble(scanner.nextLine());
                if (index % 2 == 0) {
                    if (num > evenMax) {
                        evenMax = num;
                    }
                    if (num < evenMin) {
                        evenMin = num;
                    }
                    evenSum += num;
                } else {
                    if (num > oddMax) {
                        oddMax = num;
                    }
                    if (num < oddMin) {
                        oddMin = num;
                    }
                    oddSum += num;
                }
            }
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);

            if (evenSum == 0) {
                System.out.println("EvenSum=0.00,");
            } else {
                System.out.printf("EvenSum=%.2f,%n", evenSum);
            }
            if (evenMin == Integer.MAX_VALUE) {
                System.out.println("EvenMin=No,");
            } else {
                System.out.printf("EvenMin=%.2f,%n", evenMin);
            }
            if (evenMax == Integer.MIN_VALUE) {
                System.out.println("EvenMax=No");
            } else {
                System.out.printf("EvenMax=%.2f", evenMax);
            }
        } else {
            System.out.println("OddSum=0.00,");
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
            System.out.println("EvenSum=0.00,");
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        }
    }
}