package loopStatement;

public class TypesOfLoops {
	
	//Allow us to run certain piece of codes multiple times
	//For Loop, While Loop, Do While loop
	// After java 1.4 added Enhanced for loop/for each loop
	/*
	 * Syntax for loop
	 * for(initialize; condition; increment/decrement){
	 * }
	 * code here/logic here
	 */
	/*
	 * Syntax for While loop
	 * While(condition){
	 * logic here
	 * increment/decrement
	 * }
	 */
	/*
	 * Syntax for do while loop
	 * do
	 * {
	 * 
	 * }while(condition)
	 */

	public static void main(String[] args) {
		System.out.println("----------For Loop----------");
		//i = i+2 to increase by 2
		System.out.println("Loop started");
		for(int i = 1; i<=20; i++) { 
			System.out.println("I values are "+i);
		}
		System.out.println("Loop ended");
		
		System.out.println("----------While Loop----------");
		int count = 50;
		
		while(count <= 80){
			System.out.println("Values are "+count);
			count++;
		}
		
		System.out.println("----------Do While Loop----------");
		
		int ticket = 75;
		
		do{
			System.out.println("Current ticket number is "+ticket);
			ticket++;
		}while(ticket <= 100);
	}

}
