
public class SwitchStatement {
	
	//Use switch statement to check multiple expressions

	public static void main(String[] args) {
		int score = 45;
		
		switch (score)
		{
		case 90:
			System.out.println("Score is very good");
			break;
		case 60:
			System.out.println("Score is good");
			break;
		case 40:
			System.out.println("Score is Ok");
			break;
		default:
			System.out.println("Score is not defined");
		}

	}
}
