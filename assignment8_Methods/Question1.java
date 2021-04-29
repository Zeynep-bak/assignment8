package assignment8_Methods;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
/*Create a method called "plus", its return is void and it gets no arguments.
It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within the plus method.
 */
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter your first number:");
		int num1=sc.nextInt();
		
		System.out.print("Enter your second number:");
		int num2 =sc.nextInt();
		
		plus(num1,num2);
		
	}
public static void plus(int num1, int num2) {
	System.out.println("Result: "+(num1+num2)); 
}
}
