package assignment8_Methods;

public class Question7 {

	public static void main(String[] args) {
/*Complete a method fib() that will compute Fibonacci numbers
In fibonacci series, next number is the sum of previous two numbers 
for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,……... 
The first two numbers of fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.
 */
		
		int sum=fib(10);
         
		System.out.println(sum);
	
	}
   public static int fib(int n) {
	   if(n==1) {
       return 0;
	   }
      if(n==2 ||n==3) {
        return 1;
      }
     if(n>3) {
    return	fib(n-1)+fib(n-2); 
     }
	return 0;
	
   }
}
