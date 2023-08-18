package javaprog;

public class Jio implements TraiService {

	@Override
	public void call() {
		
		System.out.println("Jio gives free unlimited calling service without any charge");
		
	}

	@Override
	public void msg() {
		
		System.out.println("Jio gives free unlimited message service to Jio to Jio network and 100 msg free to other ");
		
	}

	@Override
	public void internet() {
		
		System.out.println("Jio gives free unlimited data");
		
		
	}

	@Override
	public void valueAddService() {
		
		System.out.println("Jio gives other services as per plan");
		
	}
	
	
	
	

}
