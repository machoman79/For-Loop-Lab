import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int sum = 0;

        for (char s = 0; s < text.length(); s++) {
            char symbol = text.charAt(s);
            switch (symbol) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
