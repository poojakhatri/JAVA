
import java.lang.*;
class parent1{
	void m1(){
		System.out.println("M1 is method of Parent class");
	}
}
class child1 extends parent1{
	// void m1(){
	// 	System.out.println("M1 method of child class");

	// }
}
class inheritdemo{
	 public static void main(String[] args) {
		child1 obj1 = new child1();
		obj1.m1();
	}
}