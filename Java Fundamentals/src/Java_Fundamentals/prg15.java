package Java_Fundamentals;

import java.util.Scanner;

public class prg15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = S.nextInt();
		int i,f=0;
		for (i=2;i<x;i++)
		{
			if(x%i==0)
			{
				f=1;
				break;
			}
			
		}
		if(f==0)
		{
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}

}
