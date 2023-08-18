package javaPrograms;

public class Interface2 implements Interface1

{
	//----------THIS IS IMPLEMENTATION CLASS OF INTERFACE1 INTERFACE----------------//
	
	public static void main(String[] args) {
		
		Interface2 obj=new Interface2();
		obj.call1();
		obj.call2();
		obj.call3();  //-----------okay so I can conclude here that if we make a method default then we can complete
	                  //it in interface itself, it get execute also.
	
		obj.call4();
	}

	@Override
	public void call1() {
		
		
		System.out.println("this is interface method1");
		
	}

	@Override
	public void call2() {
		System.out.println("this is interface method2");
		
	}

	@Override
	public void call4() {
		System.out.println("im method4");
		
	}

}
