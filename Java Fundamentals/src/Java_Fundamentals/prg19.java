package Java_Fundamentals;

import java.util.Scanner;

public class prg19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = S.nextInt();
		int rem;
		int rev =0;
		while(x!=0)
		{
			rem = x % 10;
			rev = rev*10+ rem;
			x = x / 10;
		}
		System.out.println(rev);
	}	

}
