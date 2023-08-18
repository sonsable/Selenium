package collection;

import java.util.Iterator;
import java.util.Vector;

public class Iterator2 {

	public static void main(String[] args) {

//-------------------REMOVE METHOD OF ITERATOR---------------------------//
		
		Vector v=new Vector();
		v.add(12);
		v.add(55);
		v.add(100);
		v.add(156);
		v.add(223);
		
		System.out.println(v);
		
		
		Iterator obj=v.iterator();
		
		while(obj.hasNext())
		{
			
			int value=(int) obj.next();
			
			if(value%2==0)
			{
				obj.remove();
				
			}}
		
		System.out.println("elements left after removing even elements "+v);
		
		
		}

}
