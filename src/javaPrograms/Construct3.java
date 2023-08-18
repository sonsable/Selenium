package javaPrograms;

public class Construct3 extends Construct2 {
	
//-------SUBCLASS FOR CALLING PARENT CLASS CIONSTRUCTOR THROUGH SUPER KEYWORD------------//
	
	
	
	Construct3()
	{
		
		super(); //------HERE WE ARE CALLING PARENT CLASS CONSTRUCTOR
		
	}
	
	
	
	Construct3(int a, int b) { //-------------NEED TO CALL PARAMETERIZED CONSTRUCTOR LIKE THIS
		
		
		super(a, b);
		
	}
	
	

	public static void main(String[] args) {
		
		Construct3 ob=new Construct3();
		
				
		Construct3 obj=new Construct3(10,20); //------CALLING PARAMETERIZED CONSTRUCTOR

	}

}
