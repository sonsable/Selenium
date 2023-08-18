package javaPrograms;

public class Construct_Method1 {
	
	int a,b,c;
	
	

	Construct_Method1(int a1, int b1)
	{
		 a=a1;
		 b=b1;
		
		
	}
	
	public void add()
	{
		
		c=a+b;
		System.out.println("addition is "+c);
		
	}
	
	public void sub()
	{
		
		int d=a-b;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		Construct_Method1 obj=new Construct_Method1(45,88);
		
		obj.add();
		obj.sub();

	}

}
