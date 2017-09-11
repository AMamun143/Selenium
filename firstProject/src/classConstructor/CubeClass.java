package classConstructor;

public class CubeClass {

	public static void main(String[] args) {
		
		Cube cube1 = new Cube();
		
		System.out.println(cube1.getCubeVolume());
		
		Cube cube2 = new Cube(20, 20, 20);
		
		System.out.println(cube2.getCubeVolume());

	}

}
