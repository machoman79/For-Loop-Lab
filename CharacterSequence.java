import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (char symbol = 0; symbol < text.length(); symbol++) {
            System.out.println(text.charAt(symbol));
        }
    }
}
