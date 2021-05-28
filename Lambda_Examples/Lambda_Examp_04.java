package Lambda_Examples;

interface Code
{
   abstract void demo(int x,double d);	
}

public class Lambda_Examp_04 
{
  public static void main(String[] args) 
  {
	  Code c =(int x , double y)->{
		  System.out.println(x+"   "+y);
	  };
	  
	  c.demo(2,3.8);
 
  }
}
