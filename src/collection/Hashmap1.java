package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class Hashmap1 {

	public static void main(String[] args) {
		

//-------------HASHMAP IS NOT PART OF COLLECTION---------------------//
		//VALUES ARE STORED IN FORM OF KEY AND VALUES----------------------------//
		 		//VALUES CAN BE DUPLICATE BUT KEYS MUST BE UNIQUE------------------------//
						//---if we use duplicate key. ,then it will override the value---------//
		
			
		HashMap h1=new HashMap();
		HashMap h2=new HashMap(50);
		
		h1.put(1, 111);         //in hashmap add method is not there, instead we hv put
		h1.put(2, 112);
		h1.put(3, 113);
		
		h1.put("a", "apple");   //keys and values both are hetrogenous in nature
		h1.put("b", "ball"); 
		h1.put("c", "cat");
		
		h2.putAll(h1);          //we can copy one hashmap into another by putAll  method
		
		System.out.println(h2);
		System.out.println(h1);
		
		System.out.println(h1.keySet());   //it gives keys seperatly
		System.out.println(h2.values());   //it gives values seperatly
		System.out.println(h1.entrySet()); //it gives both keys and values together
		
		
		
//---AS WE KNOW WE CANT USE COLLECTION IN MAP, BUT WE CAN USE CURSOR BY TYPE CASTING------------------------//
		//--WITH ARRAYLIST ITS NOT POSSIBLE, BUT WITH SET INTERFACE ITS ACHIEVABLE--------------------------//
				 //LETS SEE BELOW		
		
//-----------HERE WE ARE USING ITERATOR CURSOR AS ITS GLOBAL---------------------------------------------//	
		
	
		Set s=h1.entrySet();
		
		
		Iterator obj=s.iterator();
		
		while(obj.hasNext())
		
		{
			 System.out.println(obj.next());
		}
		
		
//----LETS USE VECTOR COLLECTION AND TRY ABOVE THINGS-------------------------------------------------------//
		//BUT IT GIVES ERROR, SO NOT POSSIBLE WITH VECTOR, EVEN IF WE TYPE CAST IT
	
//		Vector v=(Vector) h1.entrySet();
//		
//		
//		Iterator obj1=v.iterator();
//		
//		while(obj1.hasNext())
//			
//		{
//			System.out.println(obj1.next());
//		}
		
	}

}
