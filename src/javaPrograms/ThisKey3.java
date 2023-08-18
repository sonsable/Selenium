package javaPrograms;

public class ThisKey3 {

	
	//----------INVOKING CURRENT CLASS CONSTRUCTOR USING THIS KEYWORD---------------//
	
	
	ThisKey3()
	{
		System.out.println("this is zero parameter constructor");
	}
	
	ThisKey3(int a, int b)
	{
		
		this();
		System.out.println("values of parameterized constructor "+a+" and "+b);
	}
	
	
	
	public static void main(String[] args) {
		
		ThisKey3 ob=new ThisKey3(2,3); //----------created only one instance and called both the constructors
		
	}

}
