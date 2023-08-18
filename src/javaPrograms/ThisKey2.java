package javaPrograms;


public class ThisKey2 {
	
	    int num=9;        
	    
	
	ThisKey2(int num)        //------PARAMETERIZED CONSTRUCTOR
	{
		
		System.out.println(num); //---here the value is taken from object of class that is 100
		System.out.println(this.num); //---------here this keyword is accessing global variable 9
	}
	
	
	
	public void cal1(int num)     //--------we can not access global variable in a static method via this keyword
	{
		System.out.println(num);
		System.out.println(this.num);
		
	}
	
	
	
		public static void main(String[] args) {
			ThisKey2 obj=new ThisKey2(100);
		
			obj.cal1(20);                 //--------invoking method here
	}

}
