package methods;

public class NonStaticReturn2 {
	
//-------CALLING NON STATIC METHOD WITH RETURN TYPE FROM DIFFERENT CLASS NONSTATICRETURN1 CLASS---------//	

	public static void main(String[] args) {
		
		NonstaticReturn1 obj=new NonstaticReturn1(); //TO CALL OTHER CLASS METHOD CREATED THAT CLASS OBJ
		obj.tulip();
		obj.lilly();
	
	
		NonStaticReturn2 obj1=new NonStaticReturn2(); //TO CALL SAME CLASS METHOD, CREATED SAME CLASS OBJ
		obj1.rose(0, 1, 2);
		
	
	}
	
	
//-----------------------NON STATIC METHOD WITH RETURN TYPE WITH PARAMETER IN SAME CLASS-------------------------//
	
	int rose(int a, int b, int c)
	{
		
		int d= a/b+c*a*b*c;
		System.out.println(d);
		return d;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
