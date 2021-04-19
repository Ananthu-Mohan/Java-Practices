package Java_Fundamentals;

import java.util.Scanner;

public class prg31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit,i,z;
		int f =0;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter  the limit of the array");
		limit = S.nextInt();
		int [] a = new int[limit];
		System.out.println("Enter the elements in to the array ");
		for(i=0;i<limit;i++)
		{
			a[i] = S.nextInt();
		}
		for(i=0;i<limit;i++)
		{
			if((a[i]==1)||(a[i]==4))
			{
				f=0;
			}
			else
			{
				f = 1;
				break;
			}
		}
		if(f==1)
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}
	}

}
