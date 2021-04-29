package assignment8_Methods;

public class Question_10 {

	public static void main(String[] args) {
/*isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.
for example:
              isEven(1) --> false
              isEven(8) --> true	 */
          
		isEven(245);
		isEven(1346754);
		
	}
public static int isEven(int num) {
	if(num%2==0) {
		System.out.println(num+" is even number.");
	}else {
		System.out.println(num+" is odd number.");
	}
	return num;
}
}
