package Core_java;

import java.util.Scanner;

public class sort_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int [100];
		int n ;
		int i,j;
		int temp;
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
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println("Sorted array = ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
		
	}

}
