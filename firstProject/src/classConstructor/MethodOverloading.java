package classConstructor;

public class MethodOverloading {
	
	/*
	 * declare different mathod to perform same function 
	 */

	public static void main(String[] args) {
		System.out.println(Add(10, 15));
		System.out.println(Add(10.44, 15.70));
		System.out.println(Add("Hello", " Mamun!"));
		
	}
		
	public static int Add(int a, int b) {
		return (a + b);
	}
	
	public static double Add(double a, double b) {
		return (a + b);
	}
	
	public static String Add(String a, String b) {
		return(a + b);
	}

}
