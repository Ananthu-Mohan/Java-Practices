package Basic_Part1;

import java.util.Scanner;

public class thirdLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int temp;
		int temp1;
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		int rem = 0;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a number");
		number  = S.nextInt();
		temp = number;
		temp1 = number;
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
		while(temp1!=0)
		{
			rem = temp1%10;
			if((rem>max2)&&(rem<max1))
			{
				max2 = rem;
			}
			temp1 = temp1/10;
		}
		rem = 0;
		while(number!=0)
		{
			rem = number%10;
			if((rem>max3)&&(rem<max2))
			{
				max3 = rem;
			}
			number = number/10;
		}
		System.out.println("Largest Number = "+max1);
		System.out.println("Second Largest Number = "+max2);
		System.out.println("Third Largest Number = "+max3);
	}

}
