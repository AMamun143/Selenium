package classInheritance;

/*
 * Classes in java can be extended,
 * creating new classes which retain
 * characteristics of the base class
 */

public class MyClass {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		
		rec.setValues(10,10);
		tri.setValues(10, 10);
		
		System.out.println("Area of Rectangle " +rec.area());
		System.out.println("Area of Triangle " +tri.area());

	}

}
