package javaPrograms;

public class Super2 extends Super1{
	
	
	
	int a=55;
	
	void m2()
	{
		
		System.out.println(super.a); //value of a is 4 here, bcz its accessing global variable of super class
		System.out.println(this.a);  // here value of a is 55, its accesing its own class global variable
		super.m1();           //calling super class method, it will print syso statement present in that method
		
		
	}

	public static void main(String[] args) {

		
		Super2 ob=new Super2();
		
		ob.m1();
		ob.m2();
		
		
		
		
		
		
		
		
		
	}

}
