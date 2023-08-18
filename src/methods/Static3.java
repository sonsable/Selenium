package methods;

public class Static3  {

	
	//---------CALLING STATIC METHODS FROM CLASS STATIC2--------------//
	
	  //ALSO IT HAS ITS OWN METHODS------------------------------//
	
	
	public static void msg1()
	{
		System.out.println("this is subclass public static method");
	}
	
	
	private static void msg2()
	{
		System.out.println("this is subclass private static method");
	}
	
	
	
	public static void main(String[] args) {
		
		msg1();          //static method of same class called like this
		msg2();
		
		Static2.call1(); //static methods from OTHER class called like this
		Static2.call2();
		
		

	}

}
