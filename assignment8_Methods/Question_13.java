package assignment8_Methods;

public class Question_13 {

	public static void main(String[] args) {
/*This method calculates a water bill, the method gets a double and returns a double.
The more water you use the more it will cost you (as a fine for wasting water).
for example:      waterTax(50)      waterTax(55)     waterTax(101)   waterTax(151)
                  returns 30         returns 49.5     returns 140.9   returns 235.9
the regular calculation under 50 is
bill = units * 0.60;
above 50 is:
bill = units * 0.90;
above 100 the calculation is like above 50 but with a 50 as fine
and above 150 it is the same as above 50 (units *0.90) but with a 100 fine added to the price. 	
 */
		waterTax(50);
		waterTax(55);
		waterTax(101);
		waterTax(151);
		
		
	}
public static void waterTax(double bill) {
	if(bill<=50) {
		double tax=bill*0.60;

		System.out.println("Water tax is "+tax);
	}else if(bill>50 && bill<=100) {
		double tax =bill*0.90;

		System.out.println("Water tax is "+tax);
	}else if(bill>100 && bill<=150) {
		double tax =bill*0.90+50;

		System.out.println("Water tax is "+tax);
	}else {
		double tax =bill*0.90+100;
	
	System.out.println("Water tax is "+tax);
	}
	
}
}
