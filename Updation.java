import java.util.Scanner;
public class Updation{
	public static void main(String[] args){
			int i=0;
			i++;
			System.out.println("val" + i++); 
			System.out.println("val" + i);
			++i;
			System.out.println("val" + i++);
			System.out.println("val" + i++);
		//  int z=i+ i++ + ++i +i + ++i + i++;
		// System.out.println("val" + z);
		// System.out.println("val" + i);
			int z=i- i++ - --i +i - ++i + i++;
			System.out.println("val" + z);
//  for loop
			for(int i=0;i<10;i++){
			 System.out.println("i :" + i);
			}
			int  j=10;
			while (j>0){
				System.out.println("j :" + j);
				j--;
			}
			int k=10;
			do{
				System.out.println("k :" + k);
				k--;
			}while(k>0);	
			Scanner scanner=new Scanner(System.in);			int n=scanner.nextInt();
			System.out.println(n);
		
	}
}