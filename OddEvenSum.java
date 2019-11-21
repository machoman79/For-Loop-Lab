import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numCount = Integer.parseInt(scanner.nextLine());
        int sumEven = 0;
        int sumOdd = 0;
        for (int c = 1; c <= numCount; c++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (c % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }
        if (sumEven == sumOdd) {
            System.out.printf("Yes%nSum = %d", sumEven);
        } else {
            System.out.printf("No%nDiff = " + Math.abs(sumEven - sumOdd));
        }
    }
}
