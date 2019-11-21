import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 2 * Integer.parseInt(scanner.nextLine());
        int lastPair = 0;
        int maxDiff = 0;

        for (int i = 0; i < n; i += 2) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            int currentPair = num1 + num2;
            if (i > 0) {
                int diff = Math.abs(currentPair - lastPair);
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
            lastPair = currentPair;
        }
        if (maxDiff == 0) {
            System.out.println("Yes, value=" + lastPair);
        } else {
            System.out.println("No, maxdiff=" + maxDiff);
        }
    }
}
