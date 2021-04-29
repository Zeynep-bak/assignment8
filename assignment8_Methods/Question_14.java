package assignment8_Methods;

public class Question_14 {

	public static void main(String[] args) {
/*This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.
It returns true only if both a and b are true or c is true   */

        threeLocks(true,false,false);
        threeLocks(true,true,false);
        threeLocks(true,false,true);
	}
  public static void threeLocks(boolean a,boolean b,boolean c) {

        if((a==true&&b==true)||c==true) {
        	System.out.println(true);
        }else {
        	System.out.println(false);
        }
}
}