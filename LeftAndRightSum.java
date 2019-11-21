import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numCount = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRight = 0;

        for (int c = 1; c <= numCount * 2; c++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (c <= numCount) {
                sumLeft += num;
            } else {
                sumRight += num;
            }
        }
        if (sumLeft == sumRight) {
            System.out.println("Yes, sum = " + sumLeft);
        } else {
            System.out.println("No, diff = " + Math.abs(sumLeft - sumRight));
        }
    }
}
