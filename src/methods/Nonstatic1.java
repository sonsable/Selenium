package methods;

public class Nonstatic1 {
	
	public static int a=10; 
	
	public void text1()
	{
		System.out.println("public non static method");
	}
	
	private void text2()
	
	{
		System.out.println("private non static method");
	}
	
	
	

	public static void main(String[] args) {


		Nonstatic1 obj=new Nonstatic1(); //need to create object of non static method
		
		
				obj.text1(); //and with object need to call method like this
				obj.text2();
		
	}

}
