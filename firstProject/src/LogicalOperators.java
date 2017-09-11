
public class LogicalOperators {
	
	//check multiple conditions in 1 statement
	// && AND operator(checks all conditions)   ||  OR (checks only 1)

	public static void main(String[] args) {
		int subject1 = 20;
		int subject2 = 25;
		//int subject1 = 60;
		//int subject2 = 50;
		
		if((subject1 >= 35) || (subject2 >= 35)){
			System.out.println("The condition is true");
		} else {
			System.out.println("The condition is false");
		}

	}

}
