package javaPrograms;

public interface Interface1 {
	
//	Interface1() -------------//interface can not have constructors
//	{
		
//	}
	
	
	void call1(); //-----------INTERFACE ONLY HAS INCOMEPLETE METHODS
	
	void call2(); //-----------INTERFACE METHODS ARE BY DEFAULT PUBLIC AND ABSTRACT SO NO NEED TO WRITE ABSTRACT WORD
	
	abstract void  call4(); //-------WE CAN WRITE ABSTRACT KEYWORD IF WE WANT BUT ITS NOT NECCESSORY
	
	
//***************************BELOW IS THE COMPLETE METHOD OF INTERFACE*********************************//
	
//-----as interface can not hv complete method, but i tried doing it, so it suggested me to either remove or 
//make it default method, so i made it default i tried making it protected but thats not possible in interface
	
	default void call3()

	{ 
		
		System.out.println("im complete method of interface");
	
	}
	
	

}
