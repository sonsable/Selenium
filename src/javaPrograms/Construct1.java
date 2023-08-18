package javaPrograms;

public class Construct1 {
	
	Construct1()
	{
		
		
		System.out.println("this is constructor");
		
	}
	
	Construct1(int a)
	{
		System.out.println("this is parameterized constrcutor");
	}
	
	
	Construct1(int b, String c)
	{
		System.out.println(b+" "+c);
	}
	
	

	public static void main(String[] args) {

		Construct1 obj=new Construct1(10);
		
		
		Construct1 obj1=new Construct1();
		Construct1 obj2=new Construct1(22,"apple");
		
		
	}

}
