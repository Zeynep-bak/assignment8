package assignment8_Methods;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
/*Create a method called next3 . This method gets an int argument and
 *  prints the next 3 numbers after that number. Call the method from main method and pass num to it.
enter number
1
next 3 are:
2 3 4
(put a space between numbers) */

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		int num=sc.nextInt();
		
		next3(num);
		
	}

	public static void next3(int num) {
		System.out.println("Next 3 are :"+(num+1)+" "+(num+2)+" "+(num+3));
	}
	
	
	
	
	
}
