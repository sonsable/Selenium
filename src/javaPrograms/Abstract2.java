package javaPrograms;

public class Abstract2 extends Abstract1{
	
//-------------CONCREATE CLASS OF ABSTRACT1 CLASS-----------------------------//
	
	
	public static void main(String[] args) {
		
	//	Abstract1 ob=new Abstract1();-----------------WE CAN NOT CREATE OBJECT OF ABSTRACT CLASS
		
		Abstract2 obj=new Abstract2();
		
		obj.call();
		obj.call2();
		obj.call3();
		
	}

	@Override
	void call2() 
	{
		System.out.println("im implemented method of abstract1 class");
		
	}

	@Override
	public void call()
	{
		System.out.println("im implemented method of abstract1 class");
		
	}

}
