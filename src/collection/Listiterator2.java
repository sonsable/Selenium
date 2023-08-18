package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Listiterator2 {

	public static void main(String[] args) {
//---------------------------------DIFFERENT METHODS OF LIST ITERATOR----------------------------------//
		//we can use vector class in list iterator cursor bcz thats legacy class------------//
		
		LinkedList v=new LinkedList();
		
		v.add(11);
		v.add(78);
		v.add(4);
		v.add(444);
		v.add(1000);
		v.add(50);
		
		
		System.out.println("original values of collection "+v);
		ListIterator t=v.listIterator();
		
		while(t.hasNext())
		{
			int value = (int) t.next();
			if(value==4)
			{
				t.remove();
			}
			
			else if(value==50)
			{
				t.set(999);    //here set method will replace the element, 50 replaced by 999
			}
			
			else if(value==11)
			{
				t.remove();
			}
			
			else if(value==444)
			{
				t.add(555);
			}
			
		}
		
		System.out.println("changed values "+v);
		
		
		
//------------------------------------BELOW JUST IS MY EXPERIMENT-------------------------------------//
		
	//HERE AS WE KNOW LIST ITERATOR IS ONLY APPLICABLE FOR LIST CLASSES, BUT WE USED BELOW ARRAYLIST, AND IT 
		//DIRECTLY NOT WORK, IT gives CLASS CAST EXCEPTION
		
//		ArrayList a=new ArrayList();
//		a.add(100);
//		
//		ListIterator l= a.iterator(); //here it gives sugegstion to type cast into list iterator, but doesn't work
//		
//		while(l.hasNext())
//		{
//			System.out.println(l.next());
//		}
		

	}

}
