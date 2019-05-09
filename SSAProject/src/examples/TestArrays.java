package examples;

public class TestArrays {

	public static void main(String[] args) {
		int nums[];
		nums = new int[3];
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("The value at location " + i + " is "
					+ nums[i]);
		}//for
		
		
		nums[0] = 23;
		nums[1] = 1200;
		nums[2] = 4503;
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("The value at location " + i + " is "
					+ nums[i]);
		}//for
		

	}//main

}//class
