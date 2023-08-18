package javaPrograms;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
//--------------------------BASICS OF ARRAY---------------------------------// 
				
//		String b[]=new String[5];// declaring array
//----------------------------------------------------------------------------------------//		
//		double c[]= {1,8,4,3,5,9};
//		System.out.println(c.length);
//--------------------------------------------------------------------------------------------------//
		
        int[] a=new int[5]; // declaring array
		a[0]= 45;           // ADDING ELEMENTS IN ARRAY
		a[1]=55;
		a[2]=2;
		a[3]=63;
		a[4]=1;
//		a[5]=88; not possible because its size already fulfilled.
		//IF WE ADD MORE ELEMENTS THAN DEFINED SIZE OF ARRAY, THEN WE GET ARRAY OUT OF BOUND EXCEPTION
		
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("************************************");
		
		Arrays.sort(a);    //ARRAYS SORT METHOD GIVES ELEMENTS IN ASCENDING ORDER
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		}}
