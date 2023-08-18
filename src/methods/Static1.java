package methods;

public class Static1 {
	
//--------------STATIC METHOD WITHOUT RETURN TYPE , SAME CLASS--------------------//	
	
	public static void apple() //static method without return type
	{
	
	System.out.println("this is public static method apple");
	
	
	}
	
	private static void orange()
	{
		
		System.out.println("its private static method orange");
		
		
	}

	public static void main(String[] args) {

		
		apple();  //TO CALL STATIC METHOD WE JUST NEED METHOD NAME
		
		orange();
		
		
		
		
		
		
		
	}

}
