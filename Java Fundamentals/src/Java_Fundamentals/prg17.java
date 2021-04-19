package Java_Fundamentals;

import java.util.Scanner;

public class prg17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = S.nextInt();
		int rem;
		int sum = 0;
		for (int j=1;num!=0;j++)
		{
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println(sum);
	}

}
