package methods;

public class NonStaticPara2 {
	
	
//-------------------NON STATIC WITH PARAMETER DIFFERENT CLASS-----------------------------//
	
	
	void pearl(float f, double d)
	
	{
		if(f/2==0)
		{
			System.out.println("float value is even");
		}
		else
		{
			System.out.println("float value is odd");
		}
		
		System.out.println("double value is "+d);
		
	}
	
	
	void ruby(String s1, String s2)
	
	{
		
		System.out.println(s1.charAt(2));
		System.out.println(s2.compareToIgnoreCase(s1));
	}
	
	
	

}
