package accessModifier;

public class PublicPrivateClass {

	public static void main(String[] args) {
		PublicPrivateAccess student = new PublicPrivateAccess();
		//student.Name = "Mamun";
		
		student.setName("Mamun");
		
		//System.out.println(student.Name);
		System.out.println(student.getName());

	}

}
