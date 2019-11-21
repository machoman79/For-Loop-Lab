import java.util.Scanner;

public class NumbersNToOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int c = 1; c <= num; c += 3) {
            System.out.println(c);
        }
    }
}
