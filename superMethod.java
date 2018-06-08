class Person{
	void message(){
		System.out.println("This is person class");
	}
}
class Student extends Person{
	void message(){
		System.out.println("This is Student class");
	}
	void display(){
		message();
		super.message();
	}
}
class superMethod{
	public static void main(String args[]){
		Student s = new Student();
		s.display();
	}
}