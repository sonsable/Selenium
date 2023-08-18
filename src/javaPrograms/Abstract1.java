package javaPrograms;

public abstract class Abstract1 {
	
	
	
	Abstract1()  //---------------------abstract class can have constructor but interface can not
	
	{
		System.out.println("im constructor of an Abstract class");
	}
	
	
	
	abstract public void call();  
						  
	
		
	abstract void call2(); //---------also cant make it private, bcz private method access remain within class
	
	

	
	public static void call3()
	{
		System.out.println("i am a normal static method");
	}

	public static void main(String[] args) {

		
		
		
		
	}

}
