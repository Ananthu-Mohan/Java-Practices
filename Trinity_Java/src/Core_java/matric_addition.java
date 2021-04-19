package Core_java;

import java.util.Scanner;

public class matric_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int limit ;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the limit ");
		limit = S.nextInt();
		System.out.println("Enter the first array elements  ");
		for(int i =0;i<limit;i++)
		{
			for(int j=0;j<limit;j++)
			{
				a[i][j] = S.nextInt();
			}
		}
		System.out.println("Enter the second array elements  ");
		for(int i =0;i<limit;i++)
		{
			for(int j=0;j<limit;j++)
			{
				b[i][j] = S.nextInt();
			}
		}
		for(int i =0;i<limit;i++)
		{
			for(int j=0;j<limit;j++)
			{
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		System.out.println("sum =   ");
		for(int i =0;i<limit;i++)
		{
			for(int j=0;j<limit;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
