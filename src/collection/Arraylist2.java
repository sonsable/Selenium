package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist2 {
	
	//INITIAL CAPACITY IS 10, IT DONT HV ANY METHOD FOR CAPACITY CHECK, but size method is there
	//NEW CAPACITY=CURRENT CAPACITY*(3/2)+1
	//best for retrieval
	//worst for add delete

	public static void main(String[] args) {

		ArrayList a1=new ArrayList();
		
		a1.add(55);
		a1.add(100);
		a1.add(456);
		
		
		System.out.println(a1);
		System.out.println("a1 size "+a1.size());
	
		for(Object value:a1)
		{
			System.out.println(value);
		}
//--------------------------------------------------------------------------------------------------------//
		//---------COLLECTIONS CLASS METHODS------------//
		
		ArrayList a2=new ArrayList();
		a2.add("range rover");
		a2.add("Meserati");
		a2.add("apple");
		System.out.println(a2);
		 
//	Collections.reverse(a2); //HERE IT WILL REVERSE SEQUENCE OF ELEMENTS AND NOT INDIVIDUAL WORDS OR DIGIT SEQENCE
	
		
		 Collections.addAll(a2, "car");
		
		 System.out.println("before reverse "+a2);
		 a2.remove("car");
		 System.out.println(a2);
		 
		
	}

}
