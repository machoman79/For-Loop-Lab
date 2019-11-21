import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cycles = Integer.parseInt(scanner.nextLine());
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double e = 0;

        for (int i = 1; i <= cycles; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < 200) {
                a++;
            } else if (num < 400) {
                b++;
            } else if (num < 600) {
                c++;
            } else if (num < 800) {
                d++;
            } else {
                e++;
            }
        }
        System.out.printf("%.2f%%%n", a / cycles * 100);
        System.out.printf("%.2f%%%n", b / cycles * 100);
        System.out.printf("%.2f%%%n", c / cycles * 100);
        System.out.printf("%.2f%%%n", d / cycles * 100);
        System.out.printf("%.2f%%%n", e / cycles * 100);
    }
}