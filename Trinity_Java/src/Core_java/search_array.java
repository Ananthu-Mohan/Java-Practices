package Core_java;

import java.util.Scanner;

public class search_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int [100];
		int n,check ;
		int i,j;
		int f=0;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the limit ");
		n = S.nextInt();
		System.out.println("Enter the array elements  ");
		for(i=0;i<n;i++)
		{
			a[i] = S.nextInt();
		}
		System.out.println("Enter the element to search in an array ");
		check = S.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==check)
			{
				f = 1;
				break;
			}
		}
		if(f==1)
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Not Present");
		}
	}

}
