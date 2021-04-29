package assignment8_Methods;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
/*Create a method called cube.
 *  Write all required code inside this method in order to ask the user for a number and
 *  then prints the cubed value of that number:
 */

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter your number");
		int num=sc.nextInt();
		
		cube(num);
	}
   public static void cube(int num) {

	   System.out.println(num*num*num);
}
}
