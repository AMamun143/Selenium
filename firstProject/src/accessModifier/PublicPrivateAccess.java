package accessModifier;

/*
 * Modifier          Class     Package     Subclass     World
 * public              y          y           y           y
 * protected           y          y           y           n
 * no modifier         y          y           n           n
 * private             y          n           n           n
 */

public class PublicPrivateAccess {
	//public String Name;
	//public int age;
	
	private String Name;
	private int age;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
