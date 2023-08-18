package javaPrograms;

public class TryCatch1 {
	
//------below method gives arithmetic exception-----------and below main mwthod we have handled that exception	
	
	
	public static void div()
	{
		System.out.println(100/0);//----------this gives exception
	}
	
	
	public static void main(String[] args) {
	

		try
		{
			
			int q=100/0;                 //this is risky code, prone to give error, but we handled it here 
			System.out.println(q);		 //SO program will normally execute
																
		}
		catch(ArithmeticException q)     //CATCH BLOCK WILL ONLY GET EXECUTED IF THERE IS AN EXCEPTION
		{
			
			System.out.println("risky code");
			
		}
		
		
		finally    //FINALLY BLOCK WILL GET EXECUTED WHEATHER THERE IS EXCEPTION OR NOT
		
		{
		System.out.println("im finally block statement"); 
		
		}
		
		
		
		div();         //---CALLING STATIC METHOD
		
	}
	
	

}
