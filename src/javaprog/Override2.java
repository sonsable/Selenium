package javaprog;

public class Override2 extends Override1{
	
	public static void multi(int a, int b)
	{
		
		System.out.println("this is a+b "+a+b);
	}
	
	
	public void sub()
	
	{
		System.out.println("sub");
	}
	
	
	public void sub1(int a, int b)
	{
		
		System.out.println(a+b);
	}

	
	
	public static void main(String[] args) {
		
		multi(2,5);
		
		
		Override2 obj=new Override2();
		obj.sub();                  //-------calling subclass methods here---overriding
		obj.sub1(45,4);             //-------calling subclass methods here---overriding
		
		
//		Override1.multi(44, 56);
//		
//		Override1 ob=new Override1();
//		ob.sub();
		

	}

}
