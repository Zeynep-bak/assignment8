package assignment8_Methods;

public class Question_17 {

	public static void main(String[] args) {
/*
There are a few ways to get this galacticly popular drink if it is available at the store you can buy it.
 or you can get it as a gift.
the third option is to mix its ingredients (its a secret formula):
1 from ingredient1,2 from ingredient2 and 3 from ingredient3.
or the alternate recipe: 3 from ingredient1, 1 from ingredient2 and 2 from ingredient3.
this ain't coca-cola...
You need to have exact amount of ingredients for making the drink. not less or more
getThunderBlazz(boolean avilable,boolean gift, int ingredient1 , int ingredient2, int ingredient3)

available = available at store
gift = got it as a gift
both are booleans.
then theres the three ingredients as ints
example use:

getThunderBlazz(true,false,1,2,3)
returns true

getThunderBlazz(false,false,1,2,3)
returns true

getThunderBlazz(false,false,1,5,3)
returns false

getThunderBlazz(false,false,3,1,2)
returns true

getThunderBlazz(false,false,3,1,1)
returns false

getThunderBlazz(false,true,9,7,3)
returns true


hint: use parenthesis to separate logical arguments:
(true|| false && true)||(false&&TRUE) etc
or put them in their own variables, everything to make it easy to read.
 * 		
 */

		getThunderBlazz(true,false,1,2,3);
		getThunderBlazz(false,false,1,2,3);
		getThunderBlazz(false,false,1,5,3);
		getThunderBlazz(false,false,3,1,2);
		getThunderBlazz(false,false,3,1,1);
		getThunderBlazz(false,true,9,7,3);
		
	
	}
        public static void getThunderBlazz(boolean avaible,boolean gift,int ing1,int ing2,int ing3) {
	     if((avaible==true)||(gift==true)||(ing1==1&&ing2==2&&ing3==3)||(ing1==3&&ing2==1&&ing3==2)) {
	    	 System.out.println(true);
	     }else {
	    	 System.out.println(false);
	     }
	
	
	
	
	
	
	
	
	
}
}
