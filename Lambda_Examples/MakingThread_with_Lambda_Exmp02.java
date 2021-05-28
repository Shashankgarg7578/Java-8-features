package Lambda_Examples;

public class MakingThread_with_Lambda_Exmp02
{
  public static void main(String[] args) 
  {
/*	Thread thread1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			
		}
	});*/
	  
	  Thread thread1 = new Thread(()->
	  {
		  System.out.println("I am inside in Thread-1");
		  
	  });
	  thread1.start();
  }
}
