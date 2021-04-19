package Java_Fundamentals;

import java.util.Scanner;

public class prg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a number \n");
		int x = S.nextInt();
		if(x%2==0)
		{
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is odd");
		}
	}

}
