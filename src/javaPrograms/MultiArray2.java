package javaPrograms;

public class MultiArray2 {

	public static void main(String[] args) {

		String a[][]=new String[3][4];
		
		a[0][0]="a1";
		a[0][1]="a2";
		a[0][2]="a3";
		a[1][0]="b1";
		a[1][1]="b2";
		a[1][2]="b3";
		a[1][3]="b4";
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<4;j++)
				
			{
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
		
		
	}

}
