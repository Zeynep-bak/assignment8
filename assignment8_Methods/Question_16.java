package assignment8_Methods;

public class Question_16 {

	public static void main(String[] args) {
/*To book a room first it needs to be available for rent and make sure its available at the date selected:
the room is already booked between 7/1/2018 - 7/8/2018 and not available accepting bookings only for year of 2018
e.g.:
simpleRoomBook(false,2,1,2018)
return false

simpleRoomBook(true,2,1,2018)
return true

simpleRoomBook(true,7,2,2018)
return false                  */
     
		 simpleRoomBook(false,2,1,2018);
		 simpleRoomBook(true,2,1,2018);
		 simpleRoomBook(true,7,2,2018);
	}
public static void simpleRoomBook(boolean b,int month, int day, int year) {
	
	  if(b==false||(month==7 && (day>=1||day<=8)&& year==2018)){
		  System.out.println(false);
	  }else {
		  System.out.println(true);
	  }
	
	
	
	
}
}
