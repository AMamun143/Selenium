package conditionalAndDecisionStatement;

public class AllStatements {
	/*
	 * Syntax for If statement
	 * if(condition){
	 * }
	 */
	public static void main(String[] args) {
		
		System.out.println("--------If Statement----------");
		int a = 90;
		
		if (a <=100) {
			System.out.println("Value os a is "+a);
		}
		
		System.out.println("--------If Else Statement----------");
		//String browser = "Chrome";
		//String browser = "IE";
		String browser = "Safari";
		
		if(browser.equalsIgnoreCase("Chrome")){
			System.out.println("TC executed on Chrome");
		}else if(browser.equalsIgnoreCase("Firefox")){
			System.out.println("TC executed on Firefox");
		}else if(browser.equalsIgnoreCase("IE")){
			System.out.println("TC executed on IE");
		}else {
			System.out.println("Kindly provide a valid browser name");
		}
		
		System.out.println("--------Switch Statement----------");
		
		int x =  5;
		
		switch(x){
		
		case 1:
			System.out.println("Performance is poor");
		break;
		case 2:
			System.out.println("Slow performer");
		break;
		case 3:
			System.out.println("Meeting expectation");
		break;
		case 4:
			System.out.println("Well done");
		break;
		case 5:
			System.out.println("Employee of the year");
		break;
		default:
			System.out.println("Employee should be fired");
		}
	}

}
