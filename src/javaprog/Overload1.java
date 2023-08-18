package javaprog;

public class Overload1 {
	
	
//------------------COMPILE TIME POLYMORPHISM--------STATIC POLYMORPHISM-------EARLY BINDING-------//
	//------SAME METHOD NAME----DIFF PARAMETERS-----------//
	
	
	public static void log()
	{
		System.out.println("no parameter method");
	}
	
	
	public static void log(int a)
	{
		System.out.println(a*a);
	}
	
	
	public static void log(int a, int b)
	{
		System.out.println(a+b);
	}
	
	
	public static void log(String a, String b)
	{
		System.out.println(a.concat(b));
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		log();
		log(10);
		log(1,23);
		log("alpha", "beta");
		
		
		
		

	}

}
