import java.util.Scanner;
public class StoreNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            System.out.print("Enter a number: ");
            double value = input.nextDouble();
            if (value <= 0 || index == 10) {
                break;
            }
            numbers[index] = value;
            index++;
        }
        for (int i = 0; i < index; i++) {
            System.out.println("Value: " + numbers[i]);
            total += numbers[i];
        }
        System.out.println("Total: " + total);
    }
}
