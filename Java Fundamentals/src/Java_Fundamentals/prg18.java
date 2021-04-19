package Java_Fundamentals;

import java.util.Scanner;

public class prg18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a number ");
		int x = S.nextInt();
		for(int i=1;i<=x;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
