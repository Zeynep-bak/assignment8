package assignment8_Methods;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
/*Create a method called sign.  It gets a number and tells you if its positive, negative or zero.
for example :
sign(5) => 1
sign(-30)=> -1
sign(0) => 0
sign gets an int parameter.
print out 1,-1 or 0 depending on the input
the parameter should be entered by user (create a scanner objec)*/

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your number");
		int num = sc.nextInt();
		
		sign(num);
		
		
	}

	public static void sign(int num) {
		if(num>0) {
			System.out.println("1");
		}else if(num<0){
			System.out.println("-1");
		}else {
			System.out.println("0");
		}
	System.out.println();
	
	
	}
	
}
