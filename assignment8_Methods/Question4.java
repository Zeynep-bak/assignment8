package assignment8_Methods;

public class Question4 {

	public static void main(String[] args) {
/*Create a method printHollowRect that prints a 5 on 5 hollow rectangle:
 * 	hint: you will need to use two nested for loops for that,
 *  and an if that checks if its the last or first iteration of the loop 
 *  (so you will know whet to print "*" or " ")	
 */
		printHollowRect(5,5);
	}
     public static void printHollowRect(int row, int col) {
	      for(int i=0; i<=row;i++) {
	    	  for(int j=0;j<=col;j++) { 
	    		  if((i==0||i==col)||(j==0||j==col)) { 
	    			  System.out.print("*");
	    		  }else { 
	    			  System.out.print(" ");
	    		  }
	    	  }
	      System.out.println();
	      }    	 
}
}
