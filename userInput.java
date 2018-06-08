import java.util.*;
class userInput{

	public static void main(String args[]){

		int x;
		String y;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for x:");
		x= sc.nextInt();
		System.out.println("Enter value for y:");
		y= sc.next();
		System.out.println("Value of x is");
		System.out.println(x);
		System.out.println("Value of y is");
		System.out.println(y);

	}
}