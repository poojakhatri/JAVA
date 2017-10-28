import java.util.*;
public class AreaOfCircle{

	public static void main(String[] args){

	System.out.println("Area of Circle:");
	System.out.println("Enter the readious of Circle:");
	Scanner sc = new Scanner(System.in);

	double pi=3.14 , area;
	int r = sc.nextInt();		

	System.out.println("Area of Circle:"+(pi*r*r));
	}
}