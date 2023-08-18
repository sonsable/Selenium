package javaPrograms;

public class String1 {

	public static void main(String[] args) {
		
		
//----------STRING a1 and a2 HAVE SAME WORD STORED.BUT HAVE DIFF MEMORY LOCATIONS---------//
		
		System.out.println("---------------BELOW O/P ARE FOR A STRINGS----------------------");
		
		String a1="karel";                //STORED IN	CONSTANT POOL AREA
		String a2=new String("karel");    //STORED IN NON CONSTANT POOL AREA
									   
		
		System.out.println(a1==a2); //SO HERE WHEN WE USE EQUAL SYMBOL== THEN WE WILL GET O/P AS FALSE, BECAUSE IT IS
	        	                    //COMPARING  ITS MEMORY LOCATIONS AND NOT THE VALUES OR ITS CONTENT
		
		System.out.println(a1.equals(a2)); // BUT HERE WE USED EQUALS METHOD AND ITS COMARING ITS CONTENT OR VALUES
										   //STORED AND NOT THE MEMORY LOCATION, SO O/P IS TRUE
		                               
		System.out.println(a1.equals("karel"));       //TRUE
		System.out.println(a1=="karel");              //TRUE
		System.out.println(a2==a1);                   //FALSE		

//-----BELOW BOTH B1 AND B2 HAVE SAME NAME BUT CAPITAL AND SMALL LETTERS, SO ITS STORED IN DIFFERENT LOCATION
		
		System.out.println("------------------------- BELOW O/P OF B STRINGS-------------------");		
		String b1="AALU";
		String b2="aalu";
		String b3="AALU";
		
		System.out.println(b1==b2);	//HERE IT O/P IS false
		System.out.println(b1.equals(b2));	
		System.out.println(b3==b1);	
		System.out.println(b3.equals(b1));
		
		
//-----------------------------OTHER STRINGS AND OPERATIONS ON THEM-----------------------------//
		
		System.out.println("------------------------BELOW O/P FOR C STRINGS---------------------");
		String c=new String("Aarel"); //NON CONSTANT POOL AREA
		System.out.println(c.isEmpty());
		System.out.println(c.charAt(0));
		System.out.println(c.contains("re"));
		
		String c1=c;
		System.out.println(c1);
		
		String c2 = c.concat(c1);
		System.out.println(c2);
		System.out.println(c.equals(c1));
		System.out.println(c==c2);
		System.out.println(c==c1);

//-------------------------------------------------------------------------------------------------//
		System.out.println("-------------------BELOW O/P OF D STRINGS-----------------------------");
	
		String d1="AAroha";
		String d2="aaroha";
		
		System.out.println(d1.charAt(0));
		System.out.println(d1.toUpperCase());
		System.out.println(d1.toLowerCase());
		System.out.println(d1.equalsIgnoreCase(d2));
		System.out.println(a1.concat(" "+d1));
	
	
	}

}
