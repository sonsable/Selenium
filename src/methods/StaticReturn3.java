package methods;

public class StaticReturn3  {
	
	//---------------STATIC WITH RETURN TYPE------calling methods from StaticReturn2 class

	
	public static void main(String[] args) {
		
		
	 int value = StaticReturn2.add(); // TO CALL METHOD FROM OTHER CLASS, NEED TO WRITE THAT CLASS NAME.METHOD NAME
		
		
	 int value1 = StaticReturn2.mul(12, 80); 
	 
	 System.out.println("multiplication is "+value1);
		
	 System.out.println("addition is "+value);
	 
//-----------------------------------------------------------------------------------------------------------//
	//--------------------BELOW IS THE METHOD FROM STATIC1 CLASS, LETS CALL IT HERE----------------------//
	 
	 
	 Static1.apple(); //--------------this is the method from class static1
	 
//   Static1.orange(); //cant call this method because we declare it private
	
		
	}

}
