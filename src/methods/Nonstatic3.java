package methods;

public class Nonstatic3  {
	
	//------------- --NON STATIC METHODS-------------------//
	
	
	
	public void img3()
	{
		System.out.println("subclass public non static method");
	}
	
	private void img4()

	{
		
		System.out.println("subclass private non static method");
	}
	

	
	public static void main(String[] args) {

		Nonstatic2 obj=new Nonstatic2(); 
		

		
		obj.img1(); //
		obj.img2(); //
		
		Nonstatic3 obj1=new Nonstatic3();
		
		obj1.img3(); //
		obj1.img4(); //
		
		
		
		System.out.println(Nonstatic1.a);   //-------HERE CALLING GLOBAL STATIC VARIABLE FROM CLASS NONSTATIC1
		
		
		
		
}

}
