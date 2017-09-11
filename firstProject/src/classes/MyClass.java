package classes;

public class MyClass {

	public static void main(String[] args) {
		Students mark = new Students(); // mark--> object or instance
		
		//mark.id = 1;
		//mark.Name = "Mark";
		//mark.age  = 15;
		
		mark.setId(1);
		mark.setName("Mark");
		mark.setAge(15);
		
		Students tom = new Students(); // mark--> object or instance
		
		//tom.id = 2;
		//tom.Name = "Tom";
		//tom.age  = 25;
		
		tom.setId(2);
		tom.setName("Tom");
		tom.setAge(25);
		
		//System.out.println(mark.Name + " is "+mark.age +" years old");
		System.out.println(mark.getName() + " is "+mark.getAge() +" years old");
		//System.out.println(tom.Name + " is "+tom.age +" years old");
		System.out.println(tom.getName() + " is "+tom.getAge() +" years old");
	}

}
