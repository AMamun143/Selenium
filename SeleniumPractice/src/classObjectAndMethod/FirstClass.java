package classObjectAndMethod;

public class FirstClass {
	int x = 90;
	int y = 100;

	public static void main(String[] args) {
		
		System.out.println("Program started");
		FirstClass obj1 = new FirstClass();
		obj1.sum();
		
		System.out.println("X value is: "+obj1.x);
		System.out.println("Y value is: " +obj1.y);
		System.out.println("Program ended");
		
	}
	
	//void meaning this method will not return anything
	public void sum() {
		int a = 90;
		int b = 100;
		int c = a + b;
		
		System.out.println("Sum of two numbers are "+c);
	}

}
