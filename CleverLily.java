import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double laundryMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toyCount = 0;
        int sumMoney = 0;
        int totalMoney = 0;

        for (int oddYears = 1; oddYears <= age; oddYears += 2) {
            toyCount++;
        }
        for (int evenYears = 2; evenYears <= age; evenYears += 2) {
            sumMoney += 10;
            totalMoney += sumMoney;
            totalMoney--;
        }
        double toyMoney = toyCount * toyPrice;
        double diff = laundryMachine - (toyMoney + totalMoney);

        if (diff > 0) {
            System.out.printf("No! %.2f", diff);
        } else {
            System.out.printf("Yes! %.2f", Math.abs(diff));
        }
    }
}
