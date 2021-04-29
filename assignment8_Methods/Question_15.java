package assignment8_Methods;

public class Question_15 {

	public static void main(String[] args) {
/*We have a to do list app, every time a user adds a task - a few things needed to be checked.
It should not be empty. boolean parameter needs to be true
taskId should be only 1 greater than currentID. for example if we have 7 tasks(currentId is 7)
 so the next task id is 8 , it can't be 10.
for example:   validateTask(true,2,1)          validateTask(true,3,1)          validateTask(false,3,2)
                returns true                    returns false                   returns false
 */
		validateTask(true,2,1);
		validateTask(true,3,1);
		validateTask(false,3,2);
	}
  public static boolean validateTask(boolean b,int taskId, int currentId) {
	  
	  if(b==true&&taskId==currentId+1) {
		  System.out.println("returns:"+true);
		  return true;
	  }else {
		  System.out.println("returns:"+false);
		  return false;
	  }

  }
}
