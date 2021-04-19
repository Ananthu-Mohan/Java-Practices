package Java_Fundamentals;

import java.util.*;

public class prg29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit,i;
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
		for(i=0;i<limit;i++)
		{
			if(a[i]!=10)
			{
				b[j] = a[i];
				j++;
			}
		}
		System.out.println("Without 10  array is :");
		for(j=0;j<limit;j++)
		{
			System.out.print(b[j]+"\t");
		}
		
	}

}
