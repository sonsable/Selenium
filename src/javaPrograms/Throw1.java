package javaPrograms;

public class Throw1 {
	
	
	public static void m1(int num)
	{
		
		

		if(num<1)
		{
			
			
			throw new ArithmeticException("there is an exception"); //deliberately throwing an exception here
			
		}
		
		else
		{
			System.out.println("condition false");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		m1(-3);
		
		
	}

}
