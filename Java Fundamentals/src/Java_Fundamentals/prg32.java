package Java_Fundamentals;

import java.util.*;

public class prg32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int[3];
		int [] b = new int[3];
		int [] c = new int[2];
		Scanner S = new Scanner(System.in);
		System.out.println("Enter first array elements ");
		for(int i=0;i<3;i++)
		{
			a[i] = S.nextInt();
		}
		System.out.println("Enter second array elements ");
		for(int i=0;i<3;i++)
		{
			b[i] = S.nextInt();
		}
		for(int i=0;i<2;i++)
		{
			c[i] = a[1];
			i++;
			c[i] = b[1];
		}
		System.out.println("The middile Elements are");
		for(int  i=0;i<2;i++)
		{
			System.out.print(c[i]+"\t");
		}
	}

}
