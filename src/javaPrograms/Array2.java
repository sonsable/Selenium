package javaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {

//-------------------------ASKING USER TO ENTER ELEMENTS BY SCANNER CLASS------------------//
		
		int size;
		
		System.out.println("enter size of array ");
		
		Scanner s= new Scanner(System.in);
		size=s.nextInt();
		int a[]=new int[size];
		
//------------------------below loop is to take input from user-----------------//	
		
		System.out.println("enter elements");
		
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}

//-------------below loop is to show user entered elements------------//	
		
		System.out.println("elements u entered are");
		
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		
//-----below loop is to sort elements in ascending order-----//		
		
		Arrays.sort(a);
		System.out.println("Elements in ascending order are");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		
		
		
	}

}
