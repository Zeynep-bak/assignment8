package assignment8_Methods;

public class Question_12 {

	public static void main(String[] args) {
/*The danish prince most famous quote is "to be or not to be". thats a classic example of boolean logic.
the hamletQuote method only returns true if one of or both of the boolean parameters is true.
example:    hamletQuote(true, false)          hamletQuote(false,true)         hamletQuote(false,false)
            returns true                      returns true                    returns false     */



		hamletQuote(true,false);
		hamletQuote(false,true);
		hamletQuote(false,false);

	}

	public static boolean hamletQuote(boolean b1, boolean b2) {
		if(b1==false&&b2==false) {
			System.out.println("false");
			return false;
		}else {
			System.out.println("true");
			return true;
		}
	}
	
}
