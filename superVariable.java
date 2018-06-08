class vehicle{
	int maxSpeed=100;

}
class Car extends vehicle{
	int maxSpeed = 145;
	void display(){
		System.out.println("Max speed is:"+super.maxSpeed);
	}
}
class superVariable{
	public static void main(String args[]){
		Car small  = new Car();
		small.display();
	}
}