package Basic_Part1;

import java.util.Scanner;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int temp;
		int max1 = 0;
		int max2 = 0;
		int rem = 0;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a number");
		number  = S.nextInt();
		temp = number;
		while(temp!=0)
		{
			rem = temp%10;
			if(rem>max1)
			{
				max1 = rem;
			}
			temp = temp/10;
		}
		rem = 0;
		while(number!=0)
		{
			rem = number%10;
			if((rem>max2)&&(rem<max1))
			{
				max2 = rem;
			}
			number = number/10;
		}
		System.out.println("Largest Number = "+max1);
		System.out.println("Second Largest Number = "+max2);
	}

}
