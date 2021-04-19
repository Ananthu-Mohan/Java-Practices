package Core_java;

import java.util.Scanner;

public class largest_of_three_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner S =  new Scanner(System.in);
		System.out.println("Enter the first number");
		a = S.nextInt();
		System.out.println("Enter the second number");
		b = S.nextInt();
		System.out.println("Enter the third number");
		c = S.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("Largest = "+a);
			}
			else
			{
				System.out.println("Largest = "+c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("Largest = "+b);
			}
			else
			{
				System.out.println("Largest = "+c);
			}
		}
		
	}

}
