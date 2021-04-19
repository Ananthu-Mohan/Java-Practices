package Core_java;

import java.util.Scanner;

public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c;
		Scanner S = new Scanner(System.in);
		int n ;
		System.out.println("Enter the limit ");
		n = S.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i =2 ;i<=n;i++)
		{
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
		
	}

}
