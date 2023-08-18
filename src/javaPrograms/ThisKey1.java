package javaPrograms;

public class ThisKey1 {
	
//-----------------------------THIS AND SUPER KEYWORD--------------------------//	
	
	int a=10;      //--------------GLOBAL VARIABLE
	
	

	public void add()
	{
		int a=5;  			//----------------local variable
		
		System.out.println("im local variable a "+a);
		System.out.println("im global variable a "+this.a);
		
		
	}
	
	
	public void add1()
	{
		
		String b="hello ";
	    int c=	this.a;
		
		System.out.println(b+" "+c);
		
		
	}
	public static void main(String[] args) {
		
		ThisKey1 ob=new ThisKey1();
		ob.add();
		ob.add1();

	}

}
