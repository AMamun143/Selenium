package javaLessons;

public class Arrays {

	public static void main(String[] args) {
		int [] myintarray = {1, 2, 3, 4,5}; //preferred way
		//int myintarray[] = {1, 2, 3, 4,5}; //these 2 are same
		
		/*
		 * 3 common ways to declare arrays
		 * int[] myIntArray = new int[3];
		 * int[] myIntArray = {1, 2, 3};
		 * int[] myIntArray = new int[]{1, 2, 3};
		 */
		int index = 0;
		while (index < 5) {
		System.out.println(myintarray[index]);
		index++;
		}
	}

}
