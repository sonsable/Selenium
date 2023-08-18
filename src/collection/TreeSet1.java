package collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {

		//THE MAJOR DIFFERENCE BETWEEN OTHER COLLECTION CLASSES AND TREESET IS THAT. 
		//TREE SET WILL ALLOW ONLY ONE TYPE OF DATA,
		// INITIALLY IF WE ADDED STRING THEN LATER IT WILL NOT ACCEPT INTEGER, AND VICE VERSA
		
		TreeSet t1=new TreeSet();
		
		TreeSet t2=new TreeSet();
	
		
		t1.add(10);
	//	t1.add("ant"); //gives class cast exception, bcz t1 only accepts int here
		
		t2.add("egg");
	//	t2.add(1);     //gives class cast exception, bcz t1 only accepts string here
		t2.add("milk");
		t2.add("poha");
	//	t2.add(null);  //cant add null in treeset.
		
		
		TreeSet t3=new TreeSet(t1);
		
		System.out.println("t1 "+t1);
		System.out.println("t2 "+t2);
		System.out.println(t3);
		System.out.println(t1.size());
	
		System.out.println(t1.pollFirst()); //removes and prints 1st element
		System.out.println(t2.pollLast()); //removes and prints last element
		System.out.println(t1);
		System.out.println(t2);
		
		

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
