class faculty{
	int fac_id;
	String fac_name;
	void display(){
		System.out.println("Faculty Id:"+fac_id);
		System.out.println("Faculty Name:"+fac_name);

	}
	public static void main(String a[]){
		faculty f1 = new faculty();
		f1.fac_id = 1;
		f1.fac_name ="Amit";
		faculty f2 = new faculty();
		f2.fac_id = 2;
		f2.fac_name ="Manoj";
		f1.display();
		f2.display();
	}
}