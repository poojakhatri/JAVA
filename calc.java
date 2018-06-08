import java.util.*;
class calc{

	public static void main(String args[]){
		int num1,i,j,k=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for addition and 2 for Subtraction:");
		
		num1=sc.nextInt();
		

		if(num1==1){
			System.out.println("Enter two number for Addition");
			i = sc.nextInt();
			j = sc.nextInt();
			k = i+j;
			System.out.println("Addition of both number is:"+k);

		}
		else{
			System.out.println("Enter two number for Subtration");
			i = sc.nextInt();
			j = sc.nextInt();
			if(i>j){
				k = i-j;
				System.out.println("Subtration of both number is:"+k);
			}
			else{
				System.out.println("first value is less than second so Subtration is not possible");
			}
		}
	}
}