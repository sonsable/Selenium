package collection;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Listiterator1 {

	public static void main(String[] args) {

		LinkedList v=new LinkedList();
		
		v.add(11);
		v.add(78);
		v.add(4);
		v.add(444);
		
		ListIterator t=v.listIterator();
		
		while(t.hasNext())
		{
			System.out.println(t.next());
			
		}
		
		System.out.println("elements in vector v are "+v);
		
		
	}

}
