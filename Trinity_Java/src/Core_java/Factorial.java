package Core_java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int n ;
		int fact = 1;
		System.out.print("Enter the number ");
		n = S.nextInt();
		for(int i =n ;i>0;i--)
		{
			fact = fact * i;
		}
		System.out.println("The Factorial of a number = "+fact);
	}

}
