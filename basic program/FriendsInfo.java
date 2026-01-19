import java.util.Scanner;

public class FriendsInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int anthonyAge = input.nextInt();
        double amarHeight = input.nextDouble();
        double akbarHeight = input.nextDouble();
        double anthonyHeight = input.nextDouble();
        int youngest = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        double tallest = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        System.out.println("Youngest Age: " + youngest);
        System.out.println("Tallest Height: " + tallest);
    }
}
