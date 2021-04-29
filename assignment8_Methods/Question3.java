package assignment8_Methods;

public class Question3 {

	public static void main(String[] args) {
	/*	Create 2 methods called hello() and world().
		Provide an implementation for both of them in order to print an appropriate message. 
		So hello() method should print "Hello" and world() method should print "World!".
		output: Hello World!  */		

		String str="Hello",str1=" word!";
		hello(str);
		word(str1);
		
	}

	public static void hello(String str) {
		System.out.print(str);
	}
	     
	public static void word(String str1) {
		System.out.print(str1);
	}

	
}
