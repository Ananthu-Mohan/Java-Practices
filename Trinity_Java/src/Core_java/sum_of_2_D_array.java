package Core_java;

import java.util.Scanner;

public class sum_of_2_D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[100][100];
		int limit ;
		int sum =0;
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
		for(int i =0;i<limit;i++)
		{
			for(int j=0;j<limit;j++)
			{
				sum+=a[i][j];
			}
		}
		System.out.println("Sum = "+sum);
	}

}
