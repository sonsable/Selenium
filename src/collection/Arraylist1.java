package collection;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {

		ArrayList a=new ArrayList();
		
		ArrayList a1=new ArrayList(5000);
		ArrayList a2=new ArrayList(a1);
		
		a1.size();
		a2.size();
		System.out.println(a1);
		a1.add(20);
		a1.add(56);
		a1.add("logic");
		
		System.out.println(a1);
		a1.add(0, "smart");
		System.out.println(a1);
		System.out.println(a1.contains(20));
		
		a1.remove(0);
		a1.remove("logic");
		System.out.println(a1);
		System.out.println(a1.size());
		
		System.out.println(a1.indexOf(56));
		a1.add(1, 8888);
		System.out.println(a1);
		System.out.println(a1.lastIndexOf(56)); //at both times index of and last index of im getting same ans,
		                                        //im confused
		System.out.println(a1.indexOf(56));
		
		a.addAll(0, a1);
		System.out.println(a);
		a.addAll(a2);
		System.out.println(a);
		a.add("legit");
		a1.addAll(a);
		System.out.println(a1);
		a1.addAll(1, a);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a.lastIndexOf(8888));
		System.out.println(a.lastIndexOf(56));
		System.out.println(a.lastIndexOf("legit"));
		
		a.add(null);                  // WE CAN ADD NULL IN ARRAYLIST
		System.out.println(a);
	
		
		
		
		
		
	}

}
