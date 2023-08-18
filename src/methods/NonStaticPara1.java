package methods;

public class NonStaticPara1 {
	
//-------------------------NON STATIC METHOD WITH PARAMETER SAME CLASS-------------------------------//	
	
	
	void large(int a, int b)
	{
		System.out.println(a*a+b*a/b);
	}
	
	
	void small(String a, String c)
	{
		
		System.out.println(a.concat(c));
		System.out.println(c.equals(a));
		System.out.println(a.contains("app"));
	}
	
	
	
	public static void main(String[] args) {
		
		
		NonStaticPara1 obj=new NonStaticPara1();
		obj.large(50, 400);
		obj.small("honesty is ", "best policy");
		
		
	}

}
