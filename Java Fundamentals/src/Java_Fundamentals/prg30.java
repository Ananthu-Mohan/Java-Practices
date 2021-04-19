package Java_Fundamentals;

import java.util.Scanner;

public class prg30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit,i,z;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter  the limit of the array");
		limit = S.nextInt();
		int [] a = new int[limit];
		int [] b = new int[limit];
		System.out.println("Enter the elements in to the array ");
		for(i=0;i<limit;i++)
		{
			a[i] = S.nextInt();
		}
		int j =0;
		int k =0;
		for(i=0;i<limit;i++)
		{
			if(a[i]%2==0)
			{
				b[j] = a[i];
				j++;
			}
		}
		for(i=0;i<limit;i++)
		{
			if(a[i]%2!=0)
			{
				b[j] = a[i];
				j++;
			}
		}

		for(i=0;i<limit;i++)
		{
			System.out.print(b[i]+"\t");
		}

		
	}

}
