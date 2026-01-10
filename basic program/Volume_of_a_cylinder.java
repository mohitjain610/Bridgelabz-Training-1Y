import java.util.*;

public class Volume_of_a_cylinder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int radius= sc.nextInt();
        int height= sc.nextInt();
        float Volume = 3.14f * radius* radius * height;
        System.out.println(Volume);
    }
}