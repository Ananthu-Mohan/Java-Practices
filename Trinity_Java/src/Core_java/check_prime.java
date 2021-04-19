package Core_java;

import java.util.Scanner;

public class check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int num,f=0;
		System.out.println("Enter a number ");
		num = S.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				f = 1;
				break;
			}
		}
		if(f==0)
		{
			System.out.print(num+" is a prime number");
		}
		else
		{
			System.out.print(num+" is not a prime number");
		}
	}

}
