package methods;

public class StaticReturn1 {
	
	
	public static int math() //in method declaration need to give datatype
	{
		System.out.println("meth method");
		
		int a=9; int b=0;
		return (a+b);             //need to give return type inside method
		
	}
	
	
	private static String phy()   //in method declaration need to give datatype
	{
		System.out.println("physics method");
		
		String a= "physics subject";
		String b=" is my favorite";
		
		String c=a.concat(b);
		
		return c;
	}
	
//-------------------WE CAN PASS PARAMETER IN METHOD AS WELL, LETS SEE BELOW------------------------//
	
	public static float chem(float a, float b)
	{
		return a*b;
	}
	
	public static double bio(double a,double b,double c)
	{
		
		double d=(a*b)/c;
		return d;
		
		
	}
	
	
	
	public static void main(String[] args) {

	int op1 = math();   //to call method with return type its same that we need to write method name directly, but
					    //as we've performed certain operations so that we need to store in some variables so that
	String op2 = phy();	//we can print the output
	
	float op3 = chem(1.1f,2.2f); //need to pass values of variables while calling method, here datatype is float
	 							  //so we need to write f after value
	
	double op4 = bio(2.0d,4,2); //here double used so write d after value if we writing it in decimal
	
	
	System.out.println("o/p of bio method is "+op4);
	System.out.println("chem method o/p is "+op3);
	System.out.println("string concat o/p is ="+op2);
	System.out.println("this is addition ="+op1);
	
		
	}

}
