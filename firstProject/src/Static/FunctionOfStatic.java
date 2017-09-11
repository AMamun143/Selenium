package Static;

public class FunctionOfStatic {

	public static void main(String[] args) {
	
		StaticClass hello = new StaticClass();
		StaticClass.DoSomething("Hello Mamun");
		hello.DoSomething("Hello");
		
		StaticClass hello1 = new StaticClass();
		StaticClass.DoSomething("hi");
		hello1.DoSomethingElse("Hello Mamun");
		
		StaticClass hello2 = new StaticClass();

	}

}
