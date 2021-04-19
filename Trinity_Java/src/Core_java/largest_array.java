package Core_java;

import java.util.Scanner;

public class largest_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int [100];
		int n ;
		int i,j;
		int largest;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the limit ");
		n = S.nextInt();
		System.out.println("Enter the array elements  ");
		for(i=0;i<n;i++)
		{
			a[i] = S.nextInt();
		}
		largest = a[0];
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					largest = a[j];
				}
			}
		}
		System.out.println("largest = "+largest);
		
	}

}
