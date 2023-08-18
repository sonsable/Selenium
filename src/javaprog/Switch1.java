package javaprog;

public class Switch1 {

	public static void main(String[] args) {
		

		String month="feb";
		
		
		switch(month)
		
		{
		
		
		case "jan":          //IF CASE VALUES ARE NOT UNIQUE THEN IT GIVES COMPLILE TIME ERROR, duplicate case
		{
			System.out.println("jan month");
		}
		break;                             //------------if u dont write break, it will execute all cases
		
		
		case "feb":
		{
			System.out.println("feb month");
		}
		break;
		
		
		case "march":
		{
			System.out.println("march month");
		}
		break;
		
		
		case "april":
		{
			System.out.println("april month");
		}
		break;
		
		
		default:
			
		{
			System.out.println("wrong input");
			
		}
		}
		
	}

}
