/*****ODD EVEN***/
import java.util.*;
public class oddEven{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0){
			System.out.println("Number is even");
		}
		else{
			System.out.println("Number is odd");
		}
	}
}