package Core_java;

import java.util.Scanner;

public class sum_of_n_even_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int n ;
		int total = 0;
		System.out.println("Enter the limit ");
		n = S.nextInt();
		for(int i =1 ;i<=n;i++)
		{
			if(i%2 == 0)
			{
				total =total + i;
			}
		}
		System.out.println("Sum of n even numbers = "+total);
	}

}
