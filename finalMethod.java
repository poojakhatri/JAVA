class A{
	final void one(){
		System.out.println("This is a final method");
	}
}
class finalMethod extends A{
	void one(){
		System.out.println("Illlegal");
	}
}