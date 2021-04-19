package Core_java;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int num;
		System.out.println("Enter a number ");
		num = S.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int j =0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
