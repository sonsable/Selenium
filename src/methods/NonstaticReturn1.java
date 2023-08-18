package methods;

public class NonstaticReturn1 {
	
	
//--------------------NON STATIC METHOD WITH RETURN TYPE----------SAME CLASS------------------------//
	
	int lilly()
	{
		
		int a=1;
		System.out.println("a");
		
		return a;
	
		
	}
	
	float tulip()
	{
		
		float ab=12; float bd=2.3f;
		float c=ab/bd;
		System.out.println(c);
		return c;
		
	}
	
	
	public static void main(String[] args) {
		
		NonstaticReturn1 obj=new NonstaticReturn1();
		obj.lilly();
		obj.tulip();
		

	}

}
