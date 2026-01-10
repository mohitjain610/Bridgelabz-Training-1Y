import java.util.*;

public class Power {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int base= sc.nextInt();
        int exponent= sc.nextInt();
        int result=Math.powExact(base, exponent);
        System.out.println(result);
    }
}
