package collection;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {

		
		Vector v=new Vector();
		
		Vector v1=new Vector(v);
		
		Vector v2=new Vector(500);
		v.add(34);
		v.add(0, "small");
		System.out.println(v.size());
		System.out.println(v.capacity()); //here capacity was 10, by default, later will add more elements 
		System.out.println(v.isEmpty()); //and then it will change
	
		System.out.println(v.remove(0));
		System.out.println(v);
		System.out.println(v.add(0000));
		System.out.println(v.clone());
		System.out.println(v);
		
		v.add(7);           //add is a new method of vector
		v.addElement(100);  // but as vector is a legacy class so its method names were long before
		v.add(444);
		v.add(55);
		v.add(700);
		v.add(55);
		v.add(66);
		v.add(22);
		v.add(330);
		v.add(66);
		v.add(null);
		System.out.println(v.capacity()); //now capacity became 20
		System.out.println(v);
		
		
	}

}
