package methods;

public class StaticPara1 {
	
//---	---------------------STATIC METHOD SAME CLASS WITH PARAMETER------------------------------//	
	
	static void get1(int a, int b, String c)
	{
		
		int d=a*b;
		
		System.out.println(c); 
		System.out.println(d); 
		 
	}
	
	static void get2(int e, int f, float g)
	{
		System.out.println(e+f*g);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		get1(45,50,"abc"); //here we need to pass the values of parameters
		
		get2(1,2,2.5f);
	}

}
