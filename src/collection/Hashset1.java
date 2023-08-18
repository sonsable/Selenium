package collection;

import java.util.HashSet;

public class Hashset1 {

	public static void main(String[] args) {

		HashSet h1=new HashSet();
		HashSet h2=new HashSet(100); //default capacity is 16, it grows double when current capacity fulfills upto 0.75%
	
		HashSet h3=new HashSet(200,85); //here we hv given its filling capacity that is 85, after it hits 85 it will 
										//grow double in size, its called loading factor
		
		h1.add(null);      //only 1 null insertion possible bcz it doesn't allow duplicates, but it doesn't throw error
							//or exception, it just ignores it 
		h1.add(null);      //doesn't add this, its dupe
		h1.add("sweet");
		h1.add(10);       //randomely adds value, no insertion sequence
		h1.add(10);       //doesn't add this, its dupe
		
		
		System.out.println(h1.isEmpty());
		System.out.println(h2.size());
		System.out.println(h1);
		
	}

}
