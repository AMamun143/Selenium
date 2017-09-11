package seleniumDataType;

public class PrimitiveDataType {
	
	//Global Variable is in class level. No values and still no error message
	//By default global variables are set as 0
	static int myNumber;

	public static void main(String[] args) {
		
		System.out.println("------------Boolean------------------");
		boolean status;
		status = true;
		boolean newStatus = false;
		
		System.out.println("My first status was "+status);
		System.out.println("My new status is "+newStatus);
		
		System.out.println("------------Char------------------");
		
		char a = 'M';
		char b = 'O';
		char c = 65;
		
		System.out.println("My first char value is "+a);
		System.out.println("My new char value is "+b);
		System.out.println("My third char value is "+c);
		
		System.out.println("------------byte------------------");
		//byte contains number between
		//-128 to 127
		byte marks = 98;
		System.out.println("My math marks are " +marks);
		
		//-32,768 to 32767
		short total_money = 150;
		System.out.println("My math marks are " +total_money);
		
		//-2,147,483,648 to 2,147,483,647
		int myMobile = 898980888;
		System.out.println("My mobile number is " +myMobile);
		
		//-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		long myMobile1 = 347685009;
		System.out.println("My new Mobile is " +myMobile1);
		
		System.out.println("------------Float and Double------------------");
		
		float myMathMarks = (float) 60.89; //change double to float because it's a double number
		float myMathMarks1 = 89.45f;
		double myMathMarks2 = 4545.78;
		
		System.out.println("My math marks are " +myMathMarks +" & " +myMathMarks1 +" & "+myMathMarks2);
		
		System.out.println("------------Downcasting------------------");
		
		//downcasting is converting higher data types to lower data types
		int a1 = (int) 49.45;
		
		System.out.println("Downsating Value is " +a1);
		
		System.out.println("--Local(Garbage values) and Global variables(Null/Default Values)---");
		
		//Local
		int a2 = 0;
		System.out.println(a2);
		System.out.println(myNumber);
	}

}
