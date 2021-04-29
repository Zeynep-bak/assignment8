package assignment8_Methods;

public class Question8 {

	public static void main(String[] args) {
/*Complete a method isPalindrome() that will check if the number is a palindrome.
*  Print your result as a boolean (true or false).
Do not convert int into a string!
Example:
input: 1001          input:1234
output: true          output:false  */
	
		isPalindrome(4554);
		isPalindrome(8900);
		}
		
	
    public static int isPalindrome(int num) {
    	int orginalNum=num, remainder;
    	int reversedNum=0;
    	
    	while(num!=0) {      //get the reverse of orginalNum
    		remainder=num%10;
    		reversedNum = reversedNum*10+remainder;
    		num/=10;
    	}
    		if(orginalNum==reversedNum) {   //check if reversedNum and orginalNum are equal
    			System.out.println(orginalNum+" is Palindrome.");
    		}else {
    			System.out.println(orginalNum+" is not Palindrome.");	
    		
    	}
			return reversedNum;
    		
    	
    }
	
	
	
}
