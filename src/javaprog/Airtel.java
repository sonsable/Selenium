package javaprog;

public class Airtel implements TraiService {

	@Override
	public void call() {
		
		System.out.println("Airtel gives free calling to all network");
		
	}

	@Override
	public void msg() {
		
		System.out.println("Airtel gives 100 msg free per day to all network");
		
	}

	@Override
	public void internet() {
		
		System.out.println("Airtel gives 1 gb data per day");
		
	}

	@Override
	public void valueAddService() {
		
		System.out.println("Airtel gives different value added services as per plan");
		System.out.println("***********************************************************************************");
	}
	
	
	
	

	

}
