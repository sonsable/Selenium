package javaprog;

public class This1 {
	
	int a=5;
	
	This1()
	{
		System.out.println("im a constructor");
		
	}
	
	public void call()
	{
		
		
		System.out.println(this.a);
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		This1 t=new This1();
		t.call();

	}

}
