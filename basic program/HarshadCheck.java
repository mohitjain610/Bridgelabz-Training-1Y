import java.util.Scanner;

public class HarshadCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int originalNumber = number;
        int sum = 0;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit;
            originalNumber /= 10;
        }
        if (sum != 0 && number % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
    }
}
