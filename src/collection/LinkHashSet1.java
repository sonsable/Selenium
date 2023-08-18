package collection;

import java.util.LinkedHashSet;

public class LinkHashSet1 {

	public static void main(String[] args) {

		LinkedHashSet l1=new LinkedHashSet();
		
		LinkedHashSet l2=new LinkedHashSet(50);
		
		l1.add(null);
		l1.add(null); //dupes not allowed
		l2.add(555);
		l2.add("sun");
		l1.add(000);
		LinkedHashSet l3=new LinkedHashSet(l1);
		
		System.out.println("l3 "+l3);
		System.err.println("l2 "+l2);
		System.out.println("l1 "+l1);
		System.out.println(l1.contains(null));
		System.out.println(l3.isEmpty());
		System.out.println(l3.size());
	
		
		
		
	}

}
