package Lambda_Examples;

//this is a functional interface beacause in this we only define one abstract method
interface Lambda{
	public void demo();
}

public class Lambda_Examp_01 
{
   public static void main(String[] args) 
   {
	 Lambda lambda = ()->{System.out.println("statement1");};
     lambda.demo();
   }
}
