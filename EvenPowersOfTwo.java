import java.util.Scanner;

public class EvenPowersOfTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int c = 0; c <= num; c += 2) {
            System.out.println((int) Math.pow(2, c));
        }
    }
}
