package javaPrograms;

public class MultipleInheritance3 implements MultipleInheritance1, MultipleInheritance2 {
	
//MULTIPLE INHERITANCE IS POSSIBLE IN INTERFACE ONLY, AS IT DONT HAVE ANY SUPER CLASS LIKE OBJECT IN CLASSES WE HAVE	
	
	
	public static void main(String[] args) {

		MultipleInheritance3 ob=new MultipleInheritance3();
		ob.dora1();
		ob.dora2();
		ob.dora3();
	
		}

	
	@Override
	public void dora1() {
		System.out.println("im dora1");
		
	}

	@Override
	public void dora2() {
		System.out.println("im dora2");
		
	}

	@Override
	public void dora3() {
		System.out.println("im dora3");
		
	}

}
