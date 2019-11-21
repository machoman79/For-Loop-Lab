import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > maxNum) {
                maxNum = num;
            }
            sum += num;
        }
        int diff = sum - maxNum;
        if ((maxNum - diff) == 0) {
            System.out.printf("Yes%nSum = %d", maxNum);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(maxNum - diff));
        }
    }
}
