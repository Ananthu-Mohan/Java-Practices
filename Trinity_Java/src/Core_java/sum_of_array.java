package Core_java;

import java.util.Scanner;

public class sum_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int [100];
		int n ;
		int i,j;
		int sum =0;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the limit ");
		n = S.nextInt();
		System.out.println("Enter the array elements  ");
		for(i=0;i<n;i++)
		{
			a[i] = S.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum+= a[i];
		}
		System.out.println("sum = "+sum);
	}

}
