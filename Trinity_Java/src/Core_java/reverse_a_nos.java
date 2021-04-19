package Core_java;

import java.util.Scanner;

public class reverse_a_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int n ;
		System.out.println("Enter the limit ");
		n = S.nextInt();
		int rem;
		int rev = 0;
		for(int i =0 ;n!=0;i++)
		{
			rem = n % 10;
			rev = rev*10+rem;
			n = n / 10;
		}
		System.out.println("Reverse of a number "+rev);
	}	

}
