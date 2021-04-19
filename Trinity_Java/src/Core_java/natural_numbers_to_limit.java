package Core_java;

import java.util.Scanner;

public class natural_numbers_to_limit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int n ;
		System.out.println("Enter the limit ");
		n = S.nextInt();
		for(int i =1 ;i<=n;i++)
		{
			System.out.print(i+"\t");
		}
	}

}
