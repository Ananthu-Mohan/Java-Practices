package Core_java;

import java.util.Scanner;

public class sum_of_n_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int n,total=0 ;
		System.out.println("Enter the limit ");
		n = S.nextInt();
		for(int i =1 ;i<=n;i++)
		{
			total = total + i;
		}
		System.out.println("Sum = "+total);
	}

}
