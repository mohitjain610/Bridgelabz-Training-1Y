import java.util.Scanner;
public class Lc58 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int a= lengthOfLastWord(s);
        System.out.println(a);
    }
    public static  int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");

        String lastWord = arr[arr.length - 1];

        return lastWord.length();
    }

}
