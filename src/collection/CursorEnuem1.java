package collection;

import java.util.Enumeration;
import java.util.Vector;

public class CursorEnuem1 {

	public static void main(String[] args) {

//----------------ENUMERATION------------------//----//------------WHILE LOOP AND FOR LOOP-------------//
		
//as vector is legacy class so all type of cursor are applicable on it, so for enumeration taken vector
		
		Vector v=new Vector();
		
//will add elements in it with for loop so that later we will retrieve it by cursor
		
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
			v.add(i);           //used for loop to add elements in vector
		}
		
		System.out.println("vector elements "+v);
		
//---NOW BELOW WE WILL RETRIEVE ALL ELEMENTS ONE BY ONE FROM VECTOR CLASS WITH HELP OF CURSOR--//
		
		Enumeration obj1=v.elements(); //object of enumeration
		System.out.println(obj1.hasMoreElements());
		System.out.println("----------below elements with while loop---------");
	
//--------USE CURSOR WITH WHILE LOOP-----------//
		
		while(obj1.hasMoreElements()) //used while loop bcz, it only ask for condition, and its easy
		{
			System.out.println(obj1.nextElement());
		}
		
		System.out.println("---------below elememts with for loop---------");
		
//-------BELOW USED FOR LOOP TO RETRIEVE ELEMENTS, ALSO USED 2 OBJECTS OF ENUMERATION FOR DIFF LOOPS--------//	
		
		Enumeration obj2=v.elements();
		
		for(;obj2.hasMoreElements();) //here we dont need to initialize ot to increment so kept it blank
		{
			System.out.println(obj2.nextElement());
		}
		
//--------below used for FOR EACH LOOP-------------------------------------------------------//
		
		System.out.println("---------below elements with for each loop----------");
		
		Enumeration obj3=v.elements();
		
		for(Object value:v)
		{
			obj3.hasMoreElements();
			System.out.println(value);
		}
		
		
		
		
		
	}

}
