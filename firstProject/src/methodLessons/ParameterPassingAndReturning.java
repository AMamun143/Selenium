package methodLessons;

public class ParameterPassingAndReturning {

	public static void main(String[] args) {
		sayHello("Mamun");
		sayHello("Irine");
		sayHello("Tanjim");
		sayHello("Arafat");
		
		int sum = Add(100, 201, 211);
		int result = sum *15;
		System.out.println(result);
		
		//Add(100, 200);
		//Add(10, 20);
		//Add(1000, 2000);

	}
	
	public static void sayHello(String name) {
		System.out.println("Hello " + name);
	}
	
	//public static void Add(int a, int b, int c) {
	public static int Add(int a, int b, int c) {
		//System.out.println(a + b + c);
		return (a + b + c);
	}

}
