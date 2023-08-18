package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Linklist1 {

	public static void main(String[] args) {

		LinkedList l1=new LinkedList();
		LinkedList l2=new LinkedList();
		l2.add(1000);
		
		System.out.println(l1.size()); //linked list doesn't hv any initial size or capacity
		System.out.println(l1.isEmpty());
		
		
		l1.add(56);
		l1.add(88);
		l1.add(44);
		l1.add(500);
		l1.add(500);
		l1.add("dog");
		l1.add(1, "dog");
		l1.addAll(l2);
		l1.add(null);
		
		System.out.println(l1);
		
		l1.addFirst(123);     //new method, it will add element at 1st position
		l1.addLast(456);      //new method, it will add element at last position
		
		System.out.println(l1);
		
		l1.set(0, 100000);      //set method will replace element of desired index with new element
		l1.set(2, "cat");
		
		System.out.println("linklist l1"+l1);
		
		ArrayList a=new ArrayList(l1); //we can do this, arraylist into linklist to take advantage of each other
		System.out.println("arraylist"+a);
		
		HashSet h=new HashSet(a); //we can add arraylist into hashset if we want to remove dupes, 
		System.out.println("hashset"+h);  //then again we can add it back to arraylist
		
		ArrayList b=new ArrayList(h);
		System.out.println("arraylist b"+b);
		
		
		l1.remove(0);         //removed element from 0 position
		l1.removeFirst();     //removes 1st element
		l1.removeLast();      //removes last element
		l1.poll();            //removes 1st element
		l1.pollFirst();		  //removes 1st element
		l1.pollLast();		  //removes last element
		
		l1.add(10);
		l1.add(20);
		l1.add(10);
		l1.add(10);
		l1.removeLastOccurrence(10);  //will remove last present element 10
		l1.removeFirstOccurrence(10); //will remove 1st present element 10
		
		
		System.out.println(l1.getFirst()); //will get 1st element
		System.out.println(l1.getLast());  //will get last element
		System.out.println(l1.get(1));     //will get element as per index 
		System.out.println(l1);
		
		
		
		
		
		
		
		
		
		
	}

}
