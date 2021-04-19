package Core_java;

import java.util.Scanner;

public class upper_lower_triangle_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[100][100];
		int limit ;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the limit ");
		limit = S.nextInt();
		System.out.println("Enter the array elements  ");
		for(int i =0;i<limit;i++)
		{
			for(int j=0;j<limit;j++)
			{
				a[i][j] = S.nextInt();
			}
		}
		System.out.println("Array is ");
		for(int i =0;i<limit;i++)
		{
			for(int j=0;j<limit;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Upper Triangular are ");
		for(int i =0;i<limit;i++)
		{
			for(int j=0;j<limit;j++)
			{
				if(i<=j)
				{
					System.out.print(a[i][j]+" ");
				}
			}
		}
		System.out.println();
		System.out.println("Lower Triangular are ");
		for(int i =0;i<limit;i++)
		{
			for(int j=0;j<limit;j++)
			{
				if(i>=j)
				{
					System.out.print(a[i][j]+" ");
				}
			}
		}
	}

}
