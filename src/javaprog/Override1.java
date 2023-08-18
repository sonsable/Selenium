package javaprog;

public class Override1 {
	
//------------METHOD OVERRIDING------RUNTIME POLYMORPHISM-------------LATE BINDING-----------DYNAMIC POLYMORPHISM
	//------------METHOD NAME SAME AND IN SUBCLSS WE CAN CHANGE METHOD DEFINATION/BODY AS WELL-------------//
	
	//------------THIS IS PARENT CLASS----------//
	
	public static void multi(int a, int b)
	
	{
		
		System.out.println("parent class values addition"+a+b);
	}
	
	
	public void sub()
	{
		System.out.println("subtract");
	}
	
	
	public void sub1(int a, int b)
	{
		System.out.println(a-b);
	}
	

}
