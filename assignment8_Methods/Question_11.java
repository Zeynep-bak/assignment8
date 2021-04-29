package assignment8_Methods;

public class Question_11 {

	public static void main(String[] args) {
/*c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
it returns a string value that can be "profit","loss","no loss"

for example:
c_profis(100,1500)         |  c_profis(20,5)      |    c_profis(100,100)   
returns : "profit"         |  returns : "loss"    |     returns : "no loss"    */
		
		c_profis(100,1500);
		c_profis(200,150);
		c_profis(100,100);
	}
	
	public static int c_profis(int buyPrice, int sellPrice) {
		if(buyPrice < sellPrice) {
			System.out.println("profit");
			
		}else if(buyPrice > sellPrice){
			System.out.println("loss");
			
		}else {
			System.out.println("no loss");
		}
		return 0;
	}
}
