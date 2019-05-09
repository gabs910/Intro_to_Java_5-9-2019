package com.simple;

import java.util.Scanner;

public class SimpleArithmetic {

	public static void main(String[] args) {
		System.out.println("Please enter two numbers:");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println("You entered " + x + " for x");
		System.out.println("You entered " + y + " for y");
		System.out.println("The sum of x and y is " + (x+y));
		System.out.println("The difference of x and y is " + (x-y));
		System.out.println("The product of x and y is " + (x*y));
		
		if( y == 0){
			System.out.println("Cannot divide by 0");
			} else {
				System.out.println("The division of x and y is " + (x/y));
		}//if



		scan.close();
	}

}
