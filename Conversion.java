class Conversion {

	public static void main(String[] args) {
		
		byte b;
		int i = 257;
		double d = 324.23;

		System.out.println("\nConversion of int to byte.");
		b = (byte) i;
		System.out.println("i and b " + i + " " + b );

		System.out.println("\nConversion of double to int");
		i = (int) d;
		System.out.println(d);
		System.out.println(i);

		System.out.println("\nConversion of double to byt :");
		b = (byte) d;
		System.out.println(b);
		System.out.println(d);
	}			
}