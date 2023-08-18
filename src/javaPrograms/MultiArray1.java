package javaPrograms;


//**********************************MULTI DIMENSIONAL ARRAY*********************************//

public class MultiArray1 {

	public static void main(String[] args) {

		
		int a[][]=new int[2][2];
		
		a[0][0]=45;
		a[0][1]=1;
		a[1][0]=55;
		a[1][1]=100;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}

}
