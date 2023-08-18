package collection;


import java.util.Iterator;
import java.util.Vector;

public class Iterator1Cursor {

	public static void main(String[] args) {

		Vector a1=new Vector();
		a1.add(55);
		a1.add(56);
		a1.add(57);
		
		
//---------------------FOR LOOP TO ADD ELEMENT IN VECTOR------------------------//
		
		for(int i=0;i<6;i++) //to add element in vector
		{
			a1.add(i);
		}
		System.out.println("elements of vector "+a1);
		
		System.out.println("below elements of vector retrieve with help of iterator cursor");
		
//-------ITERATOR CURSOR TO RETRIEVE ELEMENTS FROM VECTOR----------------------//
		
		Iterator obj=a1.iterator(); //object of iterator
		
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}


			
		}
		
		
	}


